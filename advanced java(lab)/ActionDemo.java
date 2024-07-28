import javax.swing.*;
import java.awt.event.*;


public class ActionDemo implements ActionListener {
    JTextField tfNum1,tfNum2,tfResult;
    JButton bAdd,bSub;

    ActionDemo()
    {
        JFrame f= new JFrame("Action command example");
        JLabel Num1=new JLabel("Num 1");
        Num1.setBounds(10, 10, 100, 20);
        f.add(Num1);
        tfNum1= new JTextField();
        tfNum1.setBounds(130, 10, 100, 20);
        f.add(tfNum1);

        JLabel Num2=new JLabel("Num 2");
        Num2.setBounds(10, 40, 100, 20);
        f.add(Num2);
        tfNum2=new JTextField();
        tfNum2.setBounds(130, 40, 100, 20);
        f.add(tfNum2);

        JLabel Result=new JLabel("Result");
        Result.setBounds(10, 70, 100, 20);
        f.add(Result);
        tfResult=new JTextField();
        tfResult.setBounds(130, 70, 100, 20);
        f.add(tfResult);

        bAdd= new JButton("ADD");
        bAdd.addActionListener(this);
        bAdd.setActionCommand("add");
        f.add(bAdd);
        bAdd.setBounds(130, 100, 50, 20);


        f.setSize(400, 200);
        f.setLayout(null);
        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int value1 = Integer.parseInt(tfNum1.getText());
        System.out.println(value1);
        int value2=Integer.parseInt(tfNum2.getText());
        if(e.getActionCommand().equals("add")){
       
            int sum= value1+value2;

            String s  = Integer.toString(sum);
            tfResult.setText(s);
        }else if(bSub.getActionCommand().equals("sub")){
            int diff= value1+value2;

            String s  = Integer.toString(diff);
            tfResult.setText(s);
        }
    }

    public static void main(String[] args) {
        new ActionDemo();
    }


    
}
