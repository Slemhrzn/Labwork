import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridDemo {
    public GridDemo(){
        JButton b1=new JButton("1");
        JButton b2=new JButton("2");
        JButton b3=new JButton("3");
        JButton b4=new JButton("4");
        JButton b5=new JButton("5");

        JFrame f= new JFrame("Grid Demo");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.setLayout(new GridLayout(3,2));
        f.setSize(500,500);
        f.setVisible(true);




    }
    public static void main(String[] args) {
        new GridDemo();
    }
}
