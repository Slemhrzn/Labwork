
import javax.swing.*;
import java.awt.*;
public class LayoutDemo {
    public LayoutDemo()
    {
        JButton b1=new JButton("East");
        JButton b2=new JButton("West");
        JButton b3=new JButton("South");
        JButton b4=new JButton("North");
        JButton b5=new JButton("Center");

        JFrame f= new JFrame("Layout Demo");
        f.add(b1,BorderLayout.EAST);
        f.add(b2,BorderLayout.WEST);
        f.add(b3,BorderLayout.SOUTH);
        f.add(b4,BorderLayout.NORTH);
        f.add(b5,BorderLayout.CENTER);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(null);
    }

    public static void main(String[] args) {
        new LayoutDemo();
    }
    
}
