package games.perses.sfml.sprite

import kotlinx.cinterop.*
import sfml.*

/**
 * User: rnentjes
 * Date: 12-4-17
 * Time: 11:45
 */
@ThreadLocal
object Textures {
    val textures: MutableMap<String, Texture> = HashMap()

    fun getOrLoad(filename: String): Texture {
        var result = textures[filename]

        if (result == null) {
            val sfTxt = sfTexture_createFromFile(filename, null)

            result = Texture(filename, sfTxt?.pointed ?: throw IllegalStateException("Texture could not be loaded: $filename"))
        }

        return result
    }

    fun destroy(filename: String) {
        val txt = textures[filename]

        if (txt != null) {
            sfTexture_destroy(txt.handle.ptr)
        }
    }

    fun destroy(texture: Texture) {
        sfTexture_destroy(texture.handle.ptr)

        textures.remove(texture.filename)
    }

    fun destroyAll() {
        for ((key, value) in textures) {
            sfTexture_destroy(value.handle.ptr)
        }

        textures.clear()
    }
}

@ThreadLocal
object Sprites {
    val sprites: MutableList<Sprite> = ArrayList()

    fun create(filename: String): Sprite {
        val texture = Textures.getOrLoad(filename)
        val sprHandle = sfSprite_create()

        val result = Sprite(texture, sprHandle?.pointed ?: throw IllegalStateException("Coulnd't create sprite!"))

        sprites.add(result)

        return result
    }

    fun destroyAll() {
        for (sprite in sprites) {
            sprite.destroy()
        }

        sprites.clear()
    }
}

class Texture(
  val filename: String,
  val handle: sfTexture
)

class Sprite(
  val texture: Texture,
  val handle: sfSprite
) {
    val position = nativeHeap.alloc<sfVector2f>()

    fun draw(window: CPointer<sfRenderWindow>, x: Float, y: Float, rotation: Float = 0f, scale: Float = 1f) {
        position.x = x
        position.y = y

        // todo: rotation and scale

        sfSprite_setPosition(handle.ptr, position.readValue())
        sfSprite_setTexture(handle.ptr, texture.handle.ptr, 0)

        sfRenderWindow_drawSprite(window, handle.ptr, null)
    }

    fun destroy() {
        sfSprite_destroy(handle.ptr)
        nativeHeap.free(position.rawPtr)
    }
}
