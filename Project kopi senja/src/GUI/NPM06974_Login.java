package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.*;
import javax.swing.JPasswordField;

public class NPM06974_Login extends JFrame {

    String nama = "Edo";
    String passwoard = "1234";

    public NPM06974_Login() {
        JFrame frame_login = new JFrame();
        getContentPane().setBackground(Color.orange);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label = new JLabel("Login Kopi Senja");
        label.setFont(new Font("Consolas", Font.BOLD, 28));
        label.setBounds(280, 50, 300, 40);
        add(label);

        JLabel labe1_nama = new JLabel("Nama : ");
        labe1_nama.setFont(new Font("Consolas", Font.BOLD, 26));
        labe1_nama.setBounds(70, 200, 100, 150);
        add(labe1_nama);

        JLabel label_pw = new JLabel("Password : ");
        label_pw.setFont(new Font("Consolas", Font.BOLD, 26));
        label_pw.setBounds(70, 250, 300, 150);
        add(label_pw);

        JTextField text_nama = new JTextField();
        text_nama.setFont(new Font("Consolas", Font.PLAIN, 26));
        text_nama.setBounds(270, 255, 450, 40);
        add(text_nama);

        JPasswordField text_pw = new JPasswordField();
        text_pw.setFont(new Font("Consolas", Font.PLAIN, 26));
        text_pw.setBounds(270, 305, 450, 40);
        add(text_pw);

        JButton button_login = new JButton("Login");
        button_login.setFont(new Font("Consolas", Font.BOLD, 20));
        button_login.setBounds(540, 400, 180, 40);
        button_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (nama.equals(text_nama.getText()) && passwoard.equals(text_pw.getText()) ) {
                    NPM06974_Menu1 menu1 = new NPM06974_Menu1();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Nama atau Passwoard Anda Salah");
                }
            }
        });
        add(button_login);
        setVisible(true);
    }
}
