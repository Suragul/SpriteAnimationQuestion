import com.soywiz.klock.milliseconds
import com.soywiz.korge.*
import com.soywiz.korge.view.*
import com.soywiz.korim.color.Colors
import com.soywiz.korim.format.*
import com.soywiz.korio.file.std.*

suspend fun main() = Korge(width = 512, height = 512, bgcolor = Colors["#2b2b2b"]) {
	val spriteMap = resourcesVfs["sprites.png"].readBitmap()
	val animation=SpriteAnimation(
		spriteMap=spriteMap,
		spriteWidth = 50,
		spriteHeight = 50,
		marginTop = 0,
		marginLeft = 0,
		columns = 4
	)
	val sprite = sprite(animation)
	sprite.playAnimation(spriteDisplayTime = 250.milliseconds, endFrame = 3)
}