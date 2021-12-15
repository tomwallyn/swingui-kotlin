import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking<Unit> {
    val runner = Runner()
    val background = Background(runner.getInterface())
    val vector = Vector(runner.getInterface())
    val song = BackgroundSongService()
    runner.getInterface().pack()

    launch(newSingleThreadContext("ApplicationBackgroundSong")) {
        song.test()
    }

    launch(newSingleThreadContext("ApplicationBorder")) {
        background.autoChangeBorder()
    }

    launch(newSingleThreadContext("ApplicationBackground")) {
        background.autoChangeBackground()
    }

    launch(newSingleThreadContext("ApplicationVector")) {
        vector.run()
    }
}