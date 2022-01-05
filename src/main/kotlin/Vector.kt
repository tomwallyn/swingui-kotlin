import java.awt.*
import java.io.File
import javax.imageio.ImageIO
import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JPanel


class Vector(var frame: JFrame) {

    private lateinit var panel: JPanel
    private lateinit var panel2: JPanel
    private lateinit var panel3: JPanel
    private lateinit var panel_trans: JPanel
    private lateinit var panel2_trans: JPanel
    private lateinit var panel3_trans: JPanel


    init {
        prepareGUI()
    }

    private fun prepareGUI() {
        panel = JPanel()
        panel.background = Color(1, 1, 1, 1)
        panel.preferredSize = Dimension(290, 900)
        panel.setLocation(0,0)

        panel_trans = JPanel()
        panel_trans.background = Color(1, 1, 1, 1)
        panel_trans.preferredSize = Dimension(900, 900)
        panel_trans.setLocation(-500,-200)

        panel2 = JPanel()
        panel2.background = Color(1, 1, 1, 1)
        panel2.preferredSize = Dimension(290, 900)
        panel2.setLocation(-0,0)

        panel2_trans = JPanel()
        panel2_trans.background = Color(1, 1, 1, 1)
        panel2_trans.preferredSize = Dimension(900, 900)
        panel2_trans.setLocation(-400,50)

        panel3 = JPanel()
        panel3.background = Color(1, 1, 1, 1)
        panel3.preferredSize = Dimension(290, 900)
        panel3.setLocation(-0,0)

        panel3_trans = JPanel()
        panel3_trans.background = Color(1, 1, 1, 1)
        panel3_trans.preferredSize = Dimension(900, 900)
        panel3_trans.setLocation(-400,50)
    }


    fun persoMid() {
        frame.add(panel)
        frame.add(panel2)
        frame.add(panel3)
    }

    fun romainMoveTrans() {
        frame.add(panel2_trans)
        val x = true
        while (x) {
            moveInRandomDirection(panel2_trans)
            moveInRandomDirectionBackward(panel2_trans)
        }

    }


    fun tomMoveTrans() {
        frame.add(panel_trans)
        val x = true
        while (x) {
            moveInRandomDirectionBackward(panel_trans)
            moveInRandomDirection(panel_trans)
        }

    }

    fun yoannMoveTrans() {
        frame.add(panel3_trans)
        val x = true
        while (x) {
            moveInRandomDirectionBackward(panel3_trans)
            moveInRandomDirection(panel3_trans)
        }

    }



    fun moveInRandomDirection(p: JPanel) {
        var newX = (-100..400).random()
        var x = p.x
        var y = p.y
        if (newX > x) {
            while (x < newX) {
                x += 5
                p.setLocation(x, y)
                frame.repaint()
                Thread.sleep(50)
            }
        }
        if (newX < x) {
            while (x > newX) {
                x -= 5

                p.setLocation(x, y)
                frame.repaint()
                Thread.sleep(50)
            }
        }

    }

    fun moveInRandomDirectionBackward(p: JPanel) {
        var newX = -200
        var x = p.x
        var y = p.y
        if (newX > x) {
            while (x < newX) {
                x += 5
                p.setLocation(x, y)
                frame.repaint()
                Thread.sleep(50)
            }
        }

        if (newX < x) {
            while (x > newX) {
                x -= 5
                p.setLocation(x, y)
                frame.repaint()
                Thread.sleep(50)
            }
        }
    }

    fun romainDance() {
        val romain1 = ImageIO.read(File("src/main/kotlin/pictures/romain1.png"))
        val romain1Label = JLabel(ImageIcon(romain1))
        romain1Label.preferredSize = Dimension(900, 900)
        val romain2 = ImageIO.read(File("src/main/kotlin/pictures/romain2.png"))
        val romain2Label = JLabel(ImageIcon(romain2))
        romain2Label.preferredSize = Dimension(900, 900)
        val romain3 = ImageIO.read(File("src/main/kotlin/pictures/romain3.png"))
        val romain3Label = JLabel(ImageIcon(romain3))
        romain3Label.preferredSize = Dimension(900, 900)
        val romain4 = ImageIO.read(File("src/main/kotlin/pictures/romain4.png"))
        val romain4Label = JLabel(ImageIcon(romain4))
        romain4Label.preferredSize = Dimension(900, 900)
        var x = true
        while (x) {
            panel2.add(romain1Label)
            java.lang.Thread.sleep(200)
            panel2.remove(romain1Label)
            panel2.add(romain2Label)
            java.lang.Thread.sleep(200)
            panel2.remove(romain2Label)
            panel2.add(romain3Label)
            java.lang.Thread.sleep(200)
            panel2.remove(romain3Label)
            panel2.add(romain4Label)
            java.lang.Thread.sleep(200)
            panel2.remove(romain4Label)
        }
    }

    fun romainDanceTrans() {
        val romain1 = ImageIO.read(File("src/main/kotlin/pictures/romain1-trans.png"))
        val romain1Label = JLabel(ImageIcon(romain1))
        romain1Label.preferredSize = Dimension(900, 900)
        val romain2 = ImageIO.read(File("src/main/kotlin/pictures/romain2-trans.png"))
        val romain2Label = JLabel(ImageIcon(romain2))
        romain2Label.preferredSize = Dimension(900, 900)
        val romain3 = ImageIO.read(File("src/main/kotlin/pictures/romain3-trans.png"))
        val romain3Label = JLabel(ImageIcon(romain3))
        romain3Label.preferredSize = Dimension(900, 900)
        val romain4 = ImageIO.read(File("src/main/kotlin/pictures/romain4-trans.png"))
        val romain4Label = JLabel(ImageIcon(romain4))
        romain4Label.preferredSize = Dimension(900, 900)
        var x = true
        while (x) {
            panel2_trans.add(romain1Label)
            java.lang.Thread.sleep(200)
            panel2_trans.remove(romain1Label)
            panel2_trans.add(romain2Label)
            java.lang.Thread.sleep(200)
            panel2_trans.remove(romain2Label)
            panel2_trans.add(romain3Label)
            java.lang.Thread.sleep(200)
            panel2_trans.remove(romain3Label)
            panel2_trans.add(romain4Label)
            java.lang.Thread.sleep(200)
            panel2_trans.remove(romain4Label)
        }
    }

    fun tomDance() {
        val tom1 = ImageIO.read(File("src/main/kotlin/pictures/tom1.png"))
        val tom1Label = JLabel(ImageIcon(tom1))
        tom1Label.preferredSize = Dimension(900, 900)
        val tom2 = ImageIO.read(File("src/main/kotlin/pictures/tom2.png"))
        val tom2Label = JLabel(ImageIcon(tom2))
        tom2Label.preferredSize = Dimension(900, 900)
        val tom3 = ImageIO.read(File("src/main/kotlin/pictures/tom3.png"))
        val tom3Label = JLabel(ImageIcon(tom3))
        tom3Label.preferredSize = Dimension(900, 900)
        val tom4 = ImageIO.read(File("src/main/kotlin/pictures/tom4.png"))
        val tom4Label = JLabel(ImageIcon(tom4))
        tom4Label.preferredSize = Dimension(900, 900)
        var x = true
        while (x) {
            panel.add(tom1Label)
            java.lang.Thread.sleep(200)
            panel.remove(tom1Label)
            panel.add(tom2Label)
            java.lang.Thread.sleep(200)
            panel.remove(tom2Label)
            panel.add(tom3Label)
            java.lang.Thread.sleep(200)
            panel.remove(tom3Label)
            panel.add(tom4Label)
            java.lang.Thread.sleep(200)
            panel.remove(tom4Label)
        }
    }

    fun tomDanceTrans() {
        val tom1 = ImageIO.read(File("src/main/kotlin/pictures/tom1-trans.png"))
        val tom1Label = JLabel(ImageIcon(tom1))
        tom1Label.preferredSize = Dimension(900, 900)
        val tom2 = ImageIO.read(File("src/main/kotlin/pictures/tom2-trans.png"))
        val tom2Label = JLabel(ImageIcon(tom2))
        tom2Label.preferredSize = Dimension(900, 900)
        val tom3 = ImageIO.read(File("src/main/kotlin/pictures/tom3-trans.png"))
        val tom3Label = JLabel(ImageIcon(tom3))
        tom3Label.preferredSize = Dimension(900, 900)
        val tom4 = ImageIO.read(File("src/main/kotlin/pictures/tom4-trans.png"))
        val tom4Label = JLabel(ImageIcon(tom4))
        tom4Label.preferredSize = Dimension(900, 900)
        var x = true
        while (x) {
            panel_trans.add(tom1Label)
            java.lang.Thread.sleep(200)
            panel_trans.remove(tom1Label)
            panel_trans.add(tom2Label)
            java.lang.Thread.sleep(200)
            panel_trans.remove(tom2Label)
            panel_trans.add(tom3Label)
            java.lang.Thread.sleep(200)
            panel_trans.remove(tom3Label)
            panel_trans.add(tom4Label)
            java.lang.Thread.sleep(200)
            panel_trans.remove(tom4Label)
        }
    }

    fun yoannDance() {
        val yoann1 = ImageIO.read(File("src/main/kotlin/pictures/yoann1.png"))
        val yoann1Label = JLabel(ImageIcon(yoann1))
        yoann1Label.preferredSize = Dimension(900, 900)
        val yoann2 = ImageIO.read(File("src/main/kotlin/pictures/yoann2.png"))
        val yoann2Label = JLabel(ImageIcon(yoann2))
        yoann2Label.preferredSize = Dimension(900, 900)
        val yoann3 = ImageIO.read(File("src/main/kotlin/pictures/yoann3.png"))
        val yoann3Label = JLabel(ImageIcon(yoann3))
        yoann3Label.preferredSize = Dimension(900, 900)
        val yoann4 = ImageIO.read(File("src/main/kotlin/pictures/yoann4.png"))
        val yoann4Label = JLabel(ImageIcon(yoann4))
        yoann4Label.preferredSize = Dimension(900, 900)
        var x = true
        while (x) {
            panel3.add(yoann1Label)
            java.lang.Thread.sleep(200)
            panel3.remove(yoann1Label)
            panel3.add(yoann2Label)
            java.lang.Thread.sleep(200)
            panel3.remove(yoann2Label)
            panel3.add(yoann3Label)
            java.lang.Thread.sleep(200)
            panel3.remove(yoann3Label)
            panel3.add(yoann4Label)
            java.lang.Thread.sleep(200)
            panel3.remove(yoann4Label)
        }
    }

    fun yoannDanceTrans() {
        val yoann1 = ImageIO.read(File("src/main/kotlin/pictures/yoann1-trans.png"))
        val yoann1Label = JLabel(ImageIcon(yoann1))
        yoann1Label.preferredSize = Dimension(900, 900)
        val yoann2 = ImageIO.read(File("src/main/kotlin/pictures/yoann2-trans.png"))
        val yoann2Label = JLabel(ImageIcon(yoann2))
        yoann2Label.preferredSize = Dimension(900, 900)
        val yoann3 = ImageIO.read(File("src/main/kotlin/pictures/yoann3-trans.png"))
        val yoann3Label = JLabel(ImageIcon(yoann3))
        yoann3Label.preferredSize = Dimension(900, 900)
        val yoann4 = ImageIO.read(File("src/main/kotlin/pictures/yoann4-trans.png"))
        val yoann4Label = JLabel(ImageIcon(yoann4))
        yoann4Label.preferredSize = Dimension(900, 900)
        var x = true
        while (x) {
            panel3_trans.add(yoann1Label)
            java.lang.Thread.sleep(200)
            panel3_trans.remove(yoann1Label)
            panel3_trans.add(yoann2Label)
            java.lang.Thread.sleep(200)
            panel3_trans.remove(yoann2Label)
            panel3_trans.add(yoann3Label)
            java.lang.Thread.sleep(200)
            panel3_trans.remove(yoann3Label)
            panel3_trans.add(yoann4Label)
            java.lang.Thread.sleep(200)
            panel3_trans.remove(yoann4Label)
        }
    }


}
