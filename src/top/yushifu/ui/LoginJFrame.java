package top.yushifu.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    public LoginJFrame(){
        this.setSize(488,430);

        //设置标题
        this.setTitle("拼图 登陆");

        //设置界面置顶
        this.setAlwaysOnTop(true);

        //设置界面居中
        this.setLocationRelativeTo(null);

        //设置默认关闭方式
        this.setDefaultCloseOperation(3);

        this.setVisible(true);
    }

}
