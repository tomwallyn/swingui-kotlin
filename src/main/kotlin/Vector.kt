import java.awt.Dimension
import java.awt.Graphics
import java.awt.Image
import java.io.File
import javax.imageio.ImageIO
import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JPanel


internal class BackgroundPanel : JPanel() {
    var image: Image? = null
    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)
        if (image != null) g.drawImage(image, 0, 0, width, height, this)
    }

    init {
        try {
            image = ImageIO.read(File("src/main/kotlin/pictures/romain1.png"))
        } catch (e: Exception) {
            e.printStackTrace() /*handled in paintComponent()*/
        }
    }
}

class Vector(var frame : JFrame) {

    private lateinit var panel: JPanel
    private lateinit var panel2: JPanel
    private lateinit var panel3: JPanel
    var x = 0
    var y = 50

    init {
        prepareGUI()
    }

    private fun prepareGUI() {
        panel = JPanel()
        val smallDitto = ImageIO.read(File("src/main/kotlin/pictures/romain1.png"))
        val picLabel = JLabel(ImageIcon(smallDitto))
        picLabel.preferredSize = Dimension(100,100)
        panel.add(picLabel)
        panel.preferredSize = Dimension(100,100)

        panel2 = BackgroundPanel()
        panel2.isOpaque = true
        panel2.preferredSize = Dimension(200,200)

        panel3 = JPanel()
        val bigDitto = ImageIO.read(File("src/main/kotlin/pictures/tom1.png"))
        val picLabel3 = JLabel(ImageIcon(bigDitto))
        picLabel3.preferredSize = Dimension(400,400)
        panel3.add(picLabel3)
        panel3.preferredSize = Dimension(400,400)
    }

    fun run(){
        frame.add(panel2)
        moveInRandomDirection(panel2)
        frame.remove(panel2)
        frame.repaint()
        frame.add(panel3)
        moveInRandomDirectionBackward(panel3)
        frame.remove(panel3)
    }



    fun moveInRandomDirection(p:JPanel){
        var newX = 400
        if (newX > x){
            while (x<newX){
                x+=5
                p.setLocation(x,y)
                frame.repaint()
                Thread.sleep(100)
            }
        }
        if (newX < x ){
            while (x>newX  ){
                x-=5

                p.setLocation(x,y)
                frame.repaint()
                Thread.sleep(100)
            }
        }

    }

    fun moveInRandomDirectionBackward(p:JPanel){
        var newX = 0
        if (newX > x ){
            while (x<newX ){
                x+=5
                p.setLocation(x,y)
                frame.repaint()
                Thread.sleep(100)
            }
        }

        if (newX < x ){
            while (x>newX){
                x-=5
                p.setLocation(x,y)
                frame.repaint()
                Thread.sleep(100)
            }
        }
    }



}
