package tang.testjava;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class PaintV4 extends MyWindow {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    ShapeDrawerPanel shapePanel;
    public PaintV4(String title) {
        super(title);
    }

    public void drawPanel() {
        shapePanel = new ShapeDrawerPanel();
        this.setPreferredSize(new Dimension(250, 250));
        this.setContentPane(shapePanel);
    }
    public static void createAndShowGUI() {
        PaintV4 window = new PaintV4("Paint V4");
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

class ShapeDrawerPanel extends JPanel {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    protected Ellipse2D.Double circle = 
        new Ellipse2D.Double(10, 10, 200, 200);
    protected Rectangle2D.Double square =
        new Rectangle2D.Double(10, 10, 200, 200);
    
    public Ellipse2D.Double getCircle() {
        return circle;
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g2d.fill(circle);
        g2d.setColor(Color.BLUE);
        g2d.draw(square);
         
    }
}