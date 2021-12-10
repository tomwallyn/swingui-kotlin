package GUI

import java.awt.*
import java.awt.event.WindowAdapter
import java.awt.event.WindowEvent
import java.io.File
import javax.imageio.ImageIO
import javax.swing.*
import kotlin.random.Random


class Vector {

    private lateinit var mainFrame: JFrame
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
        val smallDitto = ImageIO.read(File("C:\\Users\\Romain\\Desktop\\B3\\ATELIER DEVELOPPEMENT MOBILE\\swingui-kotlin\\src\\GUI\\smallDitto.png"))
        val picLabel = JLabel(ImageIcon(smallDitto))
        picLabel.preferredSize = Dimension(100,100)
        panel.add(picLabel)
        panel.preferredSize = Dimension(100,100)

        panel2 = JPanel()
        val ditto = ImageIO.read(File("C:\\Users\\Romain\\Desktop\\B3\\ATELIER DEVELOPPEMENT MOBILE\\swingui-kotlin\\src\\GUI\\ditto.png"))
        val picLabel2 = JLabel(ImageIcon(ditto))
        picLabel2.preferredSize = Dimension(200,200)
        panel2.add(picLabel2)
        panel2.preferredSize = Dimension(200,200)

        panel3 = JPanel()
        val bigDitto = ImageIO.read(File("C:\\Users\\Romain\\Desktop\\B3\\ATELIER DEVELOPPEMENT MOBILE\\swingui-kotlin\\src\\GUI\\bigDitto.png"))
        val picLabel3 = JLabel(ImageIcon(bigDitto))
        picLabel3.preferredSize = Dimension(400,400)
        panel3.add(picLabel3)
        panel3.preferredSize = Dimension(400,400)



        mainFrame = JFrame("Java SWING Examples").apply {
            setSize(400, 400)
            layout = FlowLayout()
            addWindowListener(object : WindowAdapter() {
                override fun windowClosing(windowEvent: WindowEvent?) {
                    System.exit(0)
                }
            })
            isVisible = true
        }




    }

    internal fun showEventDemo() {
        mainFrame.isVisible = true
    }

    fun run(){
        mainFrame.add(panel2)
        moveInRandomDirection(panel2)
        mainFrame.remove(panel2)
        mainFrame.repaint()
        mainFrame.add(panel3)
        moveInRandomDirectionBackward(panel3)
        mainFrame.remove(panel3)
    }



    fun moveInRandomDirection(p:JPanel){
        var newX = 400
        if (newX > x){
            while (x<newX){
                x+=5
                p.setLocation(x,y)
                mainFrame.repaint()
                Thread.sleep(100)
            }
        }
        if (newX < x ){
            while (x>newX  ){
                x-=5

                p.setLocation(x,y)
                mainFrame.repaint()
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
                mainFrame.repaint()
                Thread.sleep(100)
            }
        }

        if (newX < x ){
            while (x>newX){
                x-=5
                p.setLocation(x,y)
                mainFrame.repaint()
                Thread.sleep(100)
            }
        }
    }



}

fun main(args: Array<String>) {
    val swingControlDemo = Vector()
    swingControlDemo.showEventDemo()
    while(true){
        swingControlDemo.run()
    }
}
