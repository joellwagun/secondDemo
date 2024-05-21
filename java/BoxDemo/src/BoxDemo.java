import java.awt.*;
import javax.swing.*;
public class BoxDemo extends JFrame {
    public BoxDemo(){
        setTitle("BoxDemo");
        JButton b1 = new JButton("Btn 1");
        JButton b2 = new JButton("Btn 2");
        JButton b3 = new JButton("Btn 3");
        JButton b4 = new JButton("Longed Named Btn 4");
        JButton b5 = new JButton("Btn 5");

        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        b4.setAlignmentX(Component.CENTER_ALIGNMENT);
        b5.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        pack();
        setVisible(true);

    }
    public static void main(String[] args){
        new BoxDemo();
    }
}
