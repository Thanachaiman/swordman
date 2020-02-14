package tang.testjava;

import javax.swing.*;
import java.awt.*;
public class PaintV1 extends MyWindow {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    StringDrawerPanel stringPanel;
    public PaintV1(String title) {
        super(title);
    }

    public void drawPanel() {
        stringPanel = new StringDrawerPanel();
        this.setPreferredSize(new Dimension(200, 300));
        this.setContentPane(stringPanel);
    }
    public static void createAndShowGUI() {
        PaintV1 window = new PaintV1("Paint V1");
        window.drawPanel();
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

class StringDrawerPanel extends JPanel {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = this.getWidth();
        int height = this.getHeight();
        int x = width / 2;
        int y = height / 2;
        String msg = "Hello";
        g.drawString(msg, x, y);
    }
}