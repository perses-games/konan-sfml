import games.perses.sfml.sprite.Sprites
import games.perses.sfml.sprite.Textures
import games.perses.sfml.text.Font
import games.perses.sfml.text.Text
import kotlinx.cinterop.*
import sfml.sfCircleShape_create
import sfml.sfCircleShape_destroy
import sfml.sfCircleShape_setFillColor
import sfml.sfCircleShape_setOutlineColor
import sfml.sfCircleShape_setOutlineThickness
import sfml.sfCircleShape_setPosition
import sfml.sfCircleShape_setRadius
import sfml.sfColor_fromRGB
import sfml.sfDefaultStyle
import sfml.sfEvent
import sfml.sfEventType
import sfml.sfMusic_createFromFile
import sfml.sfMusic_destroy
import sfml.sfMusic_play
import sfml.sfMusic_setLoop
import sfml.sfRenderWindow_clear
import sfml.sfRenderWindow_close
import sfml.sfRenderWindow_create
import sfml.sfRenderWindow_destroy
import sfml.sfRenderWindow_display
import sfml.sfRenderWindow_drawCircleShape
import sfml.sfRenderWindow_isOpen
import sfml.sfRenderWindow_pollEvent
import sfml.sfRenderWindow_setVerticalSyncEnabled
import sfml.sfVector2f
import sfml.sfVideoMode

fun main(args: Array<String>) {

    val music = sfMusic_createFromFile("data/music/DST-TechnoBasic.ogg")

    val font = Font("data/fonts/COMPUTERRobot.ttf")
    val helloKonan = Text(font, 50f, 50f, "Hello Kotlin/native!", 76, 255.toByte(), 255.toByte(), 0.toByte())

    sfMusic_setLoop(music, 1)
    sfMusic_play(music)

    memScoped {
        val videoMode = alloc<sfVideoMode>()

        videoMode.width = 800u
        videoMode.height = 600u
        videoMode.bitsPerPixel = 24u

        val window = sfRenderWindow_create(videoMode.readValue(), "It works!",
            sfDefaultStyle, null)

        if (window == null) {
            println("Unable to create render window (returned null).")
        } else {
            sfRenderWindow_setVerticalSyncEnabled(window, 1)

            val circle = sfCircleShape_create()

            val circlePosition = alloc<sfVector2f>()
            circlePosition.x = 50f
            circlePosition.y = 50f

            sfCircleShape_setPosition(circle, circlePosition.readValue())
            sfCircleShape_setRadius(circle, 95f)
            sfCircleShape_setFillColor(circle, sfColor_fromRGB(0, 255, 0))
            sfCircleShape_setOutlineColor(circle, sfColor_fromRGB(0, 0, 255))
            sfCircleShape_setOutlineThickness(circle, 10f)

            val sprite = Sprites.create("data/img/smiley.png")

            var time = 0f
            var dx = 150f
            var dy = 125f
            var count = 0
            val event = alloc<sfEvent>()
            while (sfRenderWindow_isOpen(window) > 0) {
                time = 1f / 60f
                var red = (count * 2 / 3 % 512)
                var green = (count * 2 / 5 % 512)
                var blue = (count * 2 / 7 % 512)

                if (red > 255) {
                    red = 511 - red
                }
                if (green > 255) {
                    green = 511 - green
                }
                if (blue > 255) {
                    blue = 511 - blue
                }

                val clearColor = sfColor_fromRGB(red.toUByte(), green.toUByte(), blue.toUByte())

                while (sfRenderWindow_pollEvent(window, event.ptr) > 0) {
                    when (event.type) {
                        sfEventType.sfEvtClosed -> {
                            sfRenderWindow_close(window)
                        }
                        sfEventType.sfEvtKeyPressed -> {
                            // println("Key: ${event.key.code}")
                            if (event.key.code == 36) {
                                sfRenderWindow_close(window)
                            }
                        }
                        else -> {
                        }
                    }
                }

                if (circlePosition.x < 10 || circlePosition.x > 600) {
                    dx = -dx
                }
                if (circlePosition.y < 10 || circlePosition.y > 400) {
                    dy = -dy
                }

                circlePosition.x = circlePosition.x + dx * time
                circlePosition.y = circlePosition.y + dy * time

                sfCircleShape_setPosition(circle, circlePosition.readValue())

                sfRenderWindow_clear(window, clearColor)

                sfRenderWindow_drawCircleShape(window, circle, null)

                sprite.draw(window, 400f, 100f)

                helloKonan.draw(window)

                sfRenderWindow_display(window)
                count++
            }

            Sprites.destroyAll()
            Textures.destroyAll()

            sfCircleShape_destroy(circle)
            sfRenderWindow_destroy(window)
        }


        sfMusic_destroy(music)

        helloKonan.destroy()
        font.destroy()
    }

}
