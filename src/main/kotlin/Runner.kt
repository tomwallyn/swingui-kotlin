import java.awt.Color
import java.awt.Dimension
import java.awt.FlowLayout
import java.awt.event.ActionListener
import java.awt.event.WindowAdapter
import java.awt.event.WindowEvent
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.WindowConstants.EXIT_ON_CLOSE


class Runner {
    val frame = JFrame()
    var isClicked = false
    val button = JButton("Trust me")

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

    fun firstMenu(){
        frame.contentPane.background = Color.BLACK
        val panel = JPanel()
        button.background = Color.MAGENTA
        panel.add(button)
        panel.background = Color.BLACK
        frame.add(panel)
    }

    fun runnerMenu(){

        button.addActionListener(ActionListener() {
            frame.contentPane.removeAll()
            isClicked = true
        })
    }

}