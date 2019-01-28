




package Class;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

public class ClassManager extends JFrame implements MouseListener {

    DefaultTableModel model = new DefaultTableModel();

    JScrollPane jScrollPane;
    JPanel jPanel1;
    JButton jbmod;
    JButton jbadd;
    JButton jbdel;
    JButton jbflush;
    JButton jbclose;

    JTable table;

    public ClassManager() {
        this.setTitle("班级管理");

        table = this.buildTable();
        jScrollPane = new JScrollPane(table);

        jPanel1 = new JPanel();

        jbmod = new JButton("修改");
        jbflush = new JButton("刷新");
        jbadd = new JButton("添加");
        jbdel = new JButton("删除");
        jbclose = new JButton("关闭");

        jbadd.addMouseListener(this);
        jbdel.addMouseListener(this);
        jbmod.addMouseListener(this);
        jbclose.addMouseListener(this);
        jbflush.addMouseListener(this);

        jPanel1.add(jbadd);
        jPanel1.add(jbmod);
        jPanel1.add(jbdel);
        jPanel1.add(jbflush);
        jPanel1.add(jbclose);

        this.add(jScrollPane, "Center");
        this.add(jPanel1, "South");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private JTable buildTable() {
        JTable jTable;
        Vector<String> title = new Vector<>();
        title.add("test1");
        title.add("test2");






    }


    @Override

    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
