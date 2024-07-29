import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AdapterDemo extends MouseAdapter{
    JFrame f;
    AdapterDemo(){
        f=new JFrame("Java paint");
        f.addMouseListener(this);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

    }
    public void mouseDragged(MouseEvent e){
        Graphics g=f.getGraphics();
        g.setColor(Color.GREEN);
        g.drawOval(e.getX(),e.getY(),30,30);
    }
    public void mouseClicked(MouseEvent m){
        Graphics g=f.getGraphics();
        g.setColor(Color.ORANGE);
        Font f=new Font(Font.SANS_SERIF,1,30);
        g.setFont(f);
        g.drawString("Hello Advance Java",30,30);
    }
    public static void main(String[] args){
    new AdapterDemo();
    } 
}