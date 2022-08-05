package games.perses.sfml.text

import kotlinx.cinterop.*
import kotlinx.cinterop.nativeHeap.free
import sfml.*

/**
 * User: rnentjes
 * Date: 12-4-17
 * Time: 11:15
 */

class Font(
        val filename: String
) {
    val fontHandle = sfFont_createFromFile(filename)

    fun destroy() {
        sfFont_destroy(fontHandle)
    }
}

class Text(
        font: Font,
        var x: Float,
        var y: Float,
        text: String,
        size: Int,
        red: Byte = 255.toByte(),
        green: Byte = 255.toByte(),
        blue: Byte = 255.toByte()
) {
    val textHandle = sfText_create()
    val position = nativeHeap.alloc<sfVector2f>()

    init {
        sfText_setFont(textHandle, font.fontHandle)
        sfText_setString(textHandle, text)
        sfText_setCharacterSize(textHandle, size.toUInt())
        sfText_setColor(textHandle, sfColor_fromRGB(red.toUByte(), green.toUByte(), blue.toUByte()))
    }

    fun destroy() {
        sfText_destroy(textHandle)
        free(position.rawPtr)
    }

    fun draw(window: CPointer<sfRenderWindow>, x: Float = this.x, y: Float = this.y) {
        position.x = x
        position.y = y

        sfText_setPosition(textHandle, position.readValue())
        sfRenderWindow_drawText(window, textHandle, null)
    }
}
