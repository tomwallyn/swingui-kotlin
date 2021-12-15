import java.awt.Color
import javax.swing.JFrame
import javax.swing.JPanel
import kotlin.random.Random

class Background(var frame : JFrame) {
    var color : MutableList<Color>
    var auto = true

    init {
        color = mutableListOf(
            Color.RED,
            Color.BLUE,
            Color.YELLOW,
            Color.GREEN,
            Color.PINK,
            Color.ORANGE,
            Color.CYAN,
            Color.RED,
            Color.LIGHT_GRAY,
            Color.MAGENTA
        )
    }

    fun changeColor() {
        Thread.sleep(1_000)
        frame.contentPane.background = Color.RED
    }

    fun autoChangeBackground() {
        val panel = JPanel()
        while(auto == true) {
            Thread.sleep(500)
            var x = Random.nextInt(1,8)
            panel.background = color[x]
            panel.setBounds(50, 50, 800, 760)
            frame.add(panel)
        }
    }

    fun autoChangeBorder() {
        while(auto == true){
            Thread.sleep(500)
            var x = Random.nextInt(1,8)
            frame.contentPane.background = color[x]
        }
    }
}