package GUISwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener{
    private JLabel label ;
    private JButton button1,button;
    public MainFrame(){
        this.setSize(450,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocation(600,400);
        label = new JLabel("Hello Viet Nam");
//        label.setSize(100,100);
        this.add(label);
        button = new JButton("Hit me");
        button.setPreferredSize(new Dimension(50,40));
        button1 = new JButton("Call me");
        this.add(button);
        this.add(button1,"South",1);
        button.addActionListener(this);
        button1.addActionListener(this);

    }

    public static void main(String[] args) {
        MainFrame hello = new MainFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        if (b==button1){
            JOptionPane.showMessageDialog(null,"Đây là message");
        }
        if (b==button){
            JOptionPane.showConfirmDialog(null,"Thoat khong","Thoat",JOptionPane.YES_NO_OPTION);
        }
    }
}
