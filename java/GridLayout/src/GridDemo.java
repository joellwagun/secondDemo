import java.awt.*;
import javax.swing.*;
public class GridDemo {
    public GridDemo(){
        JFrame f = new JFrame();
        JButton[] btn = new JButton[6];
        for(int i = 0;i<btn.length;i++){
            btn[i] = new JButton(""+(i+1));
            f.add(btn[i]);
        }
        f.setSize(400,500);
        f.setLayout(new GridLayout(2,3));
        f.setVisible(true);
    }
    public static void main(String[] args){
        new GridDemo();
    }
}
