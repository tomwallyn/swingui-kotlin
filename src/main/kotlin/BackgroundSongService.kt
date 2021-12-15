import java.io.File
import java.io.IOException
import javax.sound.sampled.AudioSystem
import javax.sound.sampled.LineUnavailableException
import javax.sound.sampled.UnsupportedAudioFileException

class BackgroundSongService {
    fun test() {
        try {
            val input = AudioSystem.getAudioInputStream(File("src/main/kotlin/song.wav"))
            var clip = AudioSystem.getClip()
            clip.open(input)
            clip.start()
        } catch (e: UnsupportedAudioFileException) {
            e.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
        } catch (e: LineUnavailableException) {
            e.printStackTrace()
        }
    }
}