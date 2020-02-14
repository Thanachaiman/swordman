package tang.testjava;


import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JPanel buttonsPanel;
    JButton okButton, cancelButton;
    public MyWindow(String title) {
        super(title);
    }
    public void setFrameFeatures() {
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void addComponents() {
        buttonsPanel = new JPanel();
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        buttonsPanel.setLayout(new FlowLayout());
        buttonsPanel.add(okButton);
        buttonsPanel.add(cancelButton);
    }
    public static void createAndShowGUI() {
        MyWindow window = new MyWindow("GUI Test");
        window.addComponents();
        window.setFrameFeatures(); 
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}