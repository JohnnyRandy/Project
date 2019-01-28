package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {
    JPanel jP1 = new JPanel();
    JPanel jP2 = new JPanel();
    JPanel jP3 = new JPanel();
    JPanel jP4 = new JPanel();

    JButton jb1 = new JButton("登录");
    JButton jb2 = new JButton("清空");

    JLabel jlb1 = new JLabel("账号：");
    JLabel jlb2 = new JLabel("密码：");

    JTextField jtf = new JTextField(15);
    JPasswordField jpf = new JPasswordField(15);

    LoginFrame(String title) {
        super(title);
        jP2.setLayout(new GridLayout(2, 1));
        jP2.setBorder(BorderFactory.createTitledBorder("登录"));

        jP3.add(jlb1);
        jP3.add(jtf);

        jP4.add(jlb2);
        jP4.add(jpf);

        jP2.add(jP3);
        jP2.add(jP4);

        jP1.add(jb1);
        jP1.add(jb2);

        jb1.addActionListener(this);
        jb2.addActionListener(this);

        this.add(jP2);
        this.add(jP1, "South");

        this.setSize(350, 220);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

        public static void main(String[] args){
            new LoginFrame("用户登录界面");
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==jb1){
            String id = jtf.getText();
            String pwd = jpf.getText();

            if (id.equals("123")&&pwd.equals("123")){
                new MainFrame();
                this.dispose();
            }
            else if (id.equals("")||pwd.equals("")){
                JOptionPane.showMessageDialog(this, "用户名或密码不可为空");
            }
            else {
                JOptionPane.showMessageDialog(this, "用户名或密码错误");
            }
        }
        if(e.getSource()==jb2) {
            jtf.setText("");
            jpf.setText("");
        }
    }
}
