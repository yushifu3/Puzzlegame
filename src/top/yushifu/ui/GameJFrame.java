package top.yushifu.ui;

import javax.swing.*;
import java.util.Random;

public class GameJFrame extends JFrame {
    //管理图片序号
    int[][] data = new int[4][4];
    public GameJFrame(){

        //构造器
        //初始化窗口
        initJFrame();
        //初始化菜单
        initJMenuBar();

        //初始化数据
        initData();
        //初始化图片
        initImage();

        this.setVisible(true);
    }

    private void initData() {
        int[] temArr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random random = new Random();
        for (int i = 0; i < temArr.length; i++) {
            int index = random.nextInt(temArr.length);

            int temp = temArr[i];
            temArr[i] = temArr[index];
            temArr[index]=temp;
        }


        for (int i = 0; i < temArr.length; i++) {
            data[i/4][i%4] = temArr[i];
        }
    }

    private void initImage() {
        //初始化图片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num =data[i][j];
                if(num==16) {break;}
                //创建JLable （管理容器）
                JLabel jLabel =new JLabel(new ImageIcon("/Users/liuyu/IdeaProjects/Puzzlegame/image/animal/animal1/"+num+".jpg"));
                //指定位置
                jLabel.setBounds(105*j,105*i,105,105);

                //this.add(jLabel);

                this.getContentPane().add(jLabel);
            }
        }


    }


    private void initJMenuBar() {
        //初始化菜单
        //创建菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建功能选项
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于");

        //创建子目录
        JMenuItem replayItem =new JMenuItem("重新游戏");
        JMenuItem reloginItem =new JMenuItem("重新登陆");
        JMenuItem closeItem =new JMenuItem("关闭游戏");

        JMenuItem accountItem =new JMenuItem("公众号");

        //添加子目录
        functionJMenu.add(replayItem);
        functionJMenu.add(reloginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        this.setJMenuBar(jMenuBar);

    }

    private void initJFrame() {
        //设置宽高
        this.setSize(603,680);

        //设置标题
        this.setTitle("拼图单机版V1.0");

        //设置界面置顶
        this.setAlwaysOnTop(true);

        //设置界面居中
        this.setLocationRelativeTo(null);

        //设置默认关闭方式
        this.setDefaultCloseOperation(3);

        this.setLayout(null);
    }
}
