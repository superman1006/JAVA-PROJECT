package InterClass.Improve;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Test2 {
    public static void main(String[] args) {
        // 1, 创建一个窗口
        JFrame win  = new JFrame("Sign in");
        JPanel panel = new JPanel();
        win.add(panel);
        // 2, 创建一个按钮
        JButton btn = new JButton("sign");
        win.add(btn);// 3, 将按钮放到窗口上

        // 注意!!!，匿名局部内部类的使用
        // 创建按钮的监听器，检测有没有按按钮

        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //在win窗口展示一个消息窗口，内容为”Hello~“
                JOptionPane.showMessageDialog(win,"Hello~");
            }
        });

        //上面的6行code可以简化成一下code，极高的简化了code的编译
        btn.addActionListener(e -> JOptionPane.showMessageDialog(win,"Hello~"));




        // 4, 展示窗口
        win.setSize(500,400);
        win.setLocationRelativeTo(null);//居中显示
        win.setVisible(true);
    }
}
