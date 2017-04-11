import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import sfml.*

fun main(args: Array<String>) {
    memScoped {
        val videoMode = alloc<sfVideoMode>()

        videoMode.width = 800
        videoMode.height = 600
        videoMode.bitsPerPixel = 24

        val window = sfRenderWindow_create(videoMode.readValue(), "It works!", sfDefaultStyle, null)

        sfRenderWindow_setVerticalSyncEnabled(window, 1)

        val circle = sfCircleShape_create()

        val circlePosition = alloc<sfVector2f>()
        circlePosition.x = 50f
        circlePosition.y = 50f

        sfCircleShape_setPosition(circle, circlePosition.readValue())
        sfCircleShape_setRadius(circle, 100f)
        sfCircleShape_setFillColor(circle, sfColor_fromRGB(0, 255.toByte(), 0))

        var time = 0f
        var dx = 150f
        var dy = 125f
        var count = 0
        val event = alloc<sfEvent>()
        while (sfRenderWindow_isOpen(window) > 0) {
            time = 1f/60f
            var red = (count * 2 / 3 % 512)
            var green = (count * 2 / 5 % 512)
            var blue = (count * 2 / 7 % 512)

            if (red > 255) { red = 511 - red }
            if (green > 255) { green = 511 - green }
            if (blue > 255) { blue = 511 - blue }

            val clearColor = sfColor_fromRGB(red.toByte(), green.toByte(), blue.toByte())

            while (sfRenderWindow_pollEvent(window, event.ptr) > 0) {
                when(event.type) {
                    sfEventType.sfEvtClosed -> {
                        sfRenderWindow_close(window)
                    }
                    sfEventType.sfEvtKeyPressed -> {
                        // println("Key: ${event.key.code}")
                        if (event.key.code == 36) {
                            sfRenderWindow_close(window)
                        }
                    }
                    else -> {}
                }
            }

            if (circlePosition.x < 0 || circlePosition.x > 600) {
                dx = -dx
            }
            if (circlePosition.y < 0 || circlePosition.y > 400) {
                dy = -dy
            }

            circlePosition.x = circlePosition.x + dx * time
            circlePosition.y = circlePosition.y + dy * time

            sfCircleShape_setPosition(circle, circlePosition.readValue())

            sfRenderWindow_clear(window, clearColor)

            sfRenderWindow_drawCircleShape(window, circle, null)

            sfRenderWindow_display(window)
            count++
        }

        sfCircleShape_destroy(circle)
        sfRenderWindow_destroy(window)
    }

}
