import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking<Unit> {
    val runner = Runner()
    val background = Background(runner.getInterface())
    val vector = Vector(runner.getInterface())
    val song = BackgroundSongService()
    runner.getInterface().pack()
    runner.firstMenu()
    while (!runner.isClicked){
        runner.runnerMenu()
    }
    launch(newSingleThreadContext("ApplicationBackgroundSong")) {
        song.test()
    }

    launch(newSingleThreadContext("ApplicationBorder")) {
        background.autoChangeBorder()
    }

    launch(newSingleThreadContext("ApplicationBackground")) {
        background.autoChangeBackground()
    }

    launch(newSingleThreadContext("ApplicationRomainMove")) {
        vector.romainMove()
    }
    launch(newSingleThreadContext("ApplicationTomMove")) {
        vector.tomMove()
    }
    launch(newSingleThreadContext("ApplicationTomMove")) {
        vector.tomMoveTrans()
    }
    launch(newSingleThreadContext("ApplicationYoannMove")) {
        vector.yoannMove()
    }
    launch(newSingleThreadContext("ApplicationYoannMoveTrans")) {
        vector.yoannMoveTrans()
    }

    launch(newSingleThreadContext("ApplicationRomain")) {
        vector.romainDance()
    }
    launch(newSingleThreadContext("ApplicationTom")) {
        vector.tomDance()
    }
    launch(newSingleThreadContext("ApplicationTomTrans")) {
        vector.tomDanceTrans()
    }
    launch(newSingleThreadContext("ApplicationYoann")) {
        vector.yoannDance()
    }
    launch(newSingleThreadContext("ApplicationYoannTrans")) {
        vector.yoannDanceTrans()
    }
}
