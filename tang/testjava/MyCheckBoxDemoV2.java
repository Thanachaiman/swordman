package tang.testjava;

import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;

public class MyCheckBoxDemoV2 extends MyCheckBox implements ActionListener {

     protected JLabel question;
     protected JPanel boxes;
    JCheckBox cPlusPlus,php;
    /**
     *
     */
    private static final long serialVersionUID = 8449303013114941914L;

    public MyCheckBoxDemoV2(String title) {
        super(title);
    }

    public void addListeners() {
        okButton.addActionListener(this);
        cancleButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // cPlusPlus  = new JCheckBox(); 
        // php  = new JCheckBox(); 
        // java  = new JCheckBox();
        // javascript  = new JCheckBox();  
        Object source = e.getSource();
        String result = "";
        Boolean know = false;

        if (source == okButton) {
            if (python.isSelected() == true) {
                result += python.getActionCommand() + " ";
                know = true;
            }
            if (java.isSelected() == true) {
                result += java.getActionCommand() + " ";
                know = true;
            }
            if (javascript.isSelected() == true) {
                result += javascript.getActionCommand() + " ";
                know = true;
            }
            if (know) {
                JOptionPane.showMessageDialog(this, " You know " + result);
            } else {
                JOptionPane.showMessageDialog(this, " You don't know any language");
            }
        } else if (source == cancleButton) {
            python.setSelected(false);
            java.setSelected(false);
            javascript.setSelected(false);
        }
    }

    public static void main(String[] args) {
        MyCheckBoxDemoV2 myCheckbox2 = new MyCheckBoxDemoV2("My Checkbox V2");
        myCheckbox2.addComponents();
        myCheckbox2.setFrameFeatures();
        myCheckbox2.addListeners();

    }
}