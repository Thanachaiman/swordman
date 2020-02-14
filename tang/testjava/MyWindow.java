package tang.testjava;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;

class MyWindow extends JFrame {

    protected JPanel buttonsPanel;
    protected JButton okButton = new JButton("OK");
    protected JButton cancleButton = new JButton("Cancel");

    /**
     *
     */
    protected void addComponents() {
        buttonsPanel = new JPanel();
        buttonsPanel.add(okButton);
        buttonsPanel.add(cancleButton);
    }

    protected void setFrameFeatures() {
        super.setLocationRelativeTo(null);
        super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.add(buttonsPanel, BorderLayout.SOUTH);
        super.pack();
    
    }

    private static final long serialVersionUID = 1L;

    public MyWindow(String charl) {
        super(charl);
        buttonsPanel = new JPanel();
        setLayout(new BorderLayout());
    }

    public static void createAndShowGUI() {
        MyWindow msw = new MyWindow("My Simple Window");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    public static void main(String[] args) { 
        SwingUtilities.invokeLater(new Runnable() { 
            public void run() { 
                createAndShowGUI(); 
            }
        });
    } 
    
}

