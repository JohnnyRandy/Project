package Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {
    public static final String title = "学生成绩管理系统";
    JMenuBar jmb = new JMenuBar();
    JMenu jm = new JMenu("参数设置");
    JMenu jm1 = new JMenu("基本信息");
    JMenu jm2 = new JMenu("系统查询");

    JMenuItem jmm1 = new JMenuItem("班级设置");
    JMenuItem jmm2 = new JMenuItem("科目设置");
    JMenuItem jmm8 = new JMenuItem("退出系统");

    JMenuItem jmm3 = new JMenuItem("学生信息");
    JMenuItem jmm4 = new JMenuItem("教师信息");
    JMenuItem jmm5 = new JMenuItem("考试成绩");

    JMenuItem jmm6=new JMenuItem("基本信息");
    JMenuItem jmm7=new JMenuItem("成绩信息");

    MainFrame() {
        super(title);
        jmb.add(jm);
        jmb.add(jm1);
        jmb.add(jm2);

        jm.add(jmm1);
        jm.addSeparator();
        jm.add(jmm2);
        jm.addSeparator();
        jm.add(jmm8);

        jmm1.addActionListener(this);
        jmm2.addActionListener(this);
        jmm3.addActionListener(this);
        jmm8.addActionListener(this);

        jm1.add(jmm3);
        jm1.addSeparator();
        jm1.add(jmm4);
        jm1.addSeparator();
        jm1.add(jmm5);

        jm2.add(jmm6);
        jm2.addSeparator();
        jm2.add(jmm7);

        this.setJMenuBar(jmb);
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args){
        new MainFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jmm8) {
            System.exit(0);
        }

    }
}
