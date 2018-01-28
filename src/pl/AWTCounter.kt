package pl

import java.awt.*        // Using AWT container and component classes
import java.awt.event.*  // Using AWT event classes and listener interfaces
import java.awt.event.ActionListener
import com.sun.java.accessibility.util.AWTEventMonitor.addActionListener
import java.awt.event.WindowAdapter





// An AWT program inherits from the top-level container java.awt.Frame
class AWTCounter : Frame() {
    private val lblCount: Label    // Declare a Label component
    private val tfCount: TextField // Declare a TextField component
    private val btnCount: Button   // Declare a Button component
    private var count = 0     // Counter's value

    // Constructor to setup GUI components and event handlers
    init {
        layout = FlowLayout()

        lblCount = Label("Counter")
        add(lblCount)

        tfCount = TextField("0", 10)
        tfCount.isEditable = false

        add(tfCount)
        btnCount = Button("Count")

        add(btnCount)
        btnCount.addActionListener(object : ActionListener {
            override fun actionPerformed(evt: ActionEvent) {
                ++count
                tfCount.text = count.toString() + ""
            }
        })
        addWindowListener(object : WindowAdapter() {
            override fun windowClosing(evt: WindowEvent) {
                System.exit(0)  // Terminate the program
            }
        })
        title = "AWT Counter"

        setSize(250, 100)
        isVisible = true
    }
}