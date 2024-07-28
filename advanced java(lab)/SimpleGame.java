import javax.swing.*;
import java.awt.event.*;

public class SimpleGame implements MouseListener {
    JButton bcatch;
    int targetX, targetY, currentX, currentY;
    Timer timer;

    SimpleGame() {
        JFrame f = new JFrame("Simple game");
        bcatch = new JButton("Catch me");
        bcatch.setBounds(10, 10, 100, 20);
        bcatch.addMouseListener(this);
        f.add(bcatch);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        
        currentX = bcatch.getX();
        currentY = bcatch.getY();
    }

    public static void main(String[] args) {
        new SimpleGame();
    }

    public void mouseClicked(MouseEvent m) {
        targetX = 400;
        targetY = 10;
        
        // Stop any existing timer before starting a new one
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }

        timer = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int dx = (targetX - currentX) / 10;
                int dy = (targetY - currentY) / 10;
                
                // Move the button a small step
                currentX += dx;
                currentY += dy;

                // Set the button's new position
                bcatch.setBounds(currentX, currentY, 100, 20);

                // Check if the button has reached the target position
                if (Math.abs(targetX - currentX) < 2 && Math.abs(targetY - currentY) < 2) {
                    bcatch.setBounds(targetX, targetY, 100, 20);
                    ((Timer)e.getSource()).stop();
                }
            }
        });
        timer.start();
    }

    public void mouseExited(MouseEvent m) { }
    public void mousePressed(MouseEvent m) { }
    public void mouseReleased(MouseEvent m) { }
    public void mouseEntered(MouseEvent m) { }
}
