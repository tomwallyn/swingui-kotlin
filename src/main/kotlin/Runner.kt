import java.awt.Dimension
import java.awt.FlowLayout
import java.awt.event.WindowAdapter
import java.awt.event.WindowEvent
import javax.swing.JFrame

class Runner {
    val frame = JFrame()

    init {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.preferredSize = Dimension(900, 900)
        frame.setLayout(FlowLayout());
        frame.isVisible = true
        frame.setLocationRelativeTo(null)
        frame.addWindowListener(object : WindowAdapter() {
            override fun windowClosing(windowEvent: WindowEvent?) {
                System.exit(0)
            }
        })
    }

    fun getInterface(): JFrame {
        return frame
    }
}