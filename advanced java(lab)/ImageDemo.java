import java.awt.*;
import javax.swing.*;

public class  ImageDemo extends Canvas{
    private Image image;
    public ImageDemo(String imgpath){
        ImageIcon icon = new ImageIcon(imgpath);
        image = icon.getImage();

    }
   

    public void paint(Graphics g){
        g.drawImage(image,30,30,this);
    }

    public static void main(String[] args){
        ImageDemo imagedemo=new ImageDemo("deadpool.jfif");
        JFrame f=new JFrame("Image show");
        f.add(imagedemo);
        f.setSize(500,500);
        f.setVisible(true);


    }
    
}
