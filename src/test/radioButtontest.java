package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class radioButtontest extends JFrame implements ItemListener, ActionListener {
    JRadioButton opt1;
    JRadioButton opt2;
    JPanel jp1;
    JPanel jp2;
    JLabel jl;

    radioButtontest(String title){
        super(title);
        jp1 = new JPanel();
        jp1.setBorder(BorderFactory.createTitledBorder("请选择"));

        opt1 = new JRadioButton("1");
        opt2 = new JRadioButton("2");

        opt1.addItemListener(this);
        opt2.addItemListener(this);

        jp1.add(opt1);
        jp1.add(opt2);

        ButtonGroup bg1 = new ButtonGroup();

        bg1.add(opt1);
        bg1.add(opt2);

        jp2 = new JPanel();
        jl = new JLabel();
        jp2.add(jl);

        this.setLayout(new GridLayout(2, 1));
        this.add(jp1);
        this.add(jp2);
        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new radioButtontest("单选按钮测试");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (opt1.isSelected()) {
            jl.setText(opt1.getText());
        }
        else {
            jl.setText(opt2.getText());
        }
    }
}
