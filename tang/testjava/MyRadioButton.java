package tang.testjava;

import javax.swing.*;
import java.awt.*;

public class MyRadioButton extends MyWindow {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JCheckBox checkboxes;
    JPanel overallPanel, gradesPanel;
    JLabel label;
    JRadioButton a, b, c, d;
    ButtonGroup grades;
    final static int NUM_ROWS = 5;
    final static int NUM_COLS = 20;
    public MyRadioButton(String title) {
        super(title);
    }
    public void addComponents() {
        super.addComponents();
        label = new JLabel("A grade that a student who works hard will get");
        gradesPanel = new JPanel();
        a = new JRadioButton("A", true);
        b = new JRadioButton("B");
        c = new JRadioButton("C");
        d = new JRadioButton("D");
        gradesPanel.add(a);
        gradesPanel.add(b);
        gradesPanel.add(c);
        gradesPanel.add(d);
        overallPanel = new JPanel();
        overallPanel.setLayout(new GridLayout(3,1));
        overallPanel.add(label);
        overallPanel.add(gradesPanel);
        overallPanel.add(buttonsPanel);
        this.setContentPane(overallPanel);
    }
    public static void main(String[] args) {
        MyRadioButton myrb = new MyRadioButton("My Radio Buttons");
        myrb.addComponents();
        myrb.setFrameFeatures(); 
    }
}