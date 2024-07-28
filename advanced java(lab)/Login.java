import javax.swing.*;
import java.awt.event.*;
public class Login implements ActionListener{
    JLabel message ;
    JTextField tfUser;
    JPasswordField tfPasswordField;
    Login(){
        message=new JLabel();
        JFrame f= new JFrame("Login");
        JLabel user= new JLabel("Username");
        user.setBounds(10,10, 100, 20);
        f.add(user);
        tfUser= new JTextField();
        tfUser.setBounds(130, 10, 100, 20);
        f.add(tfUser);
        JLabel password= new JLabel("Password");
        password.setBounds(10, 40, 100, 20);
        f.add(password);
        JPasswordField tfPassword=new JPasswordField();
        tfPassword.setBounds(130, 40, 100, 20);
        f.add(tfPassword);
        JButton Login= new JButton("Login");
        Login.setBounds(130, 80, 100, 20);
        Login.addActionListener(this);
        f.add(Login);
        message.setBounds(130, 110, 150, 20);
        f.add(message);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Login();
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(tfUser.getText().equals("admin")
        && tfPassword.equals("admin")){
            message.setText("Login Success");
        }
        else{
            message.setText("invalid");
        }
    }
}