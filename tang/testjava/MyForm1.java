package tang.testjava;

import javax.swing.*;
//import java.awt.*;

public class MyForm1 extends MyWindow {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JLabel nameLabel;
    JTextField nameTxtField;
    final int TXTFIELD_WIDTH = 15;
    public MyForm1(String title) {
        super(title);
    }
    public void addComponents() {
        super.addComponents();
        nameLabel = new JLabel("Name:");
        nameTxtField = new JTextField(TXTFIELD_WIDTH);
        buttonsPanel.add(nameLabel);
        buttonsPanel.add(nameTxtField);
    }
    public static void main(String[] args) {
        MyForm1 myForm1 = new MyForm1("My Form");
        myForm1.addComponents();
        myForm1.setFrameFeatures();

    }
}