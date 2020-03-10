package edu.jframe;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class TestJFrame extends JFrame {
    Image ball;//图像的定义
    Image beijing;

    {
        try {
            beijing=GameUtil.getImage("zhaopian/1532433097495_feeds_215958400_4-0.jpeg");
            ball = GameUtil.getImage("zhaopian/汽车.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
class PaintThread extends Thread{
        @Override
    public void run(){
            while (true){
                try {
                    repaint();//重画
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
}
    @Override
    public void paint(Graphics g){//g相当于画笔
        super.paint(g);

        Color c=g.getColor();//在初始的时候取原来的颜色
        Font f=g.getFont();
        g.setColor(Color.LIGHT_GRAY);//设置颜色
        g.setFont(new Font("微软雅黑",Font.ITALIC,50));//设置字体

        g.drawString("窗口被重画",800,800);
        g.drawImage(beijing,0,0,null);//引入图像
        g.drawImage(ball,50,50,null);

        g.setColor(c);//用完的时候放回去，防止其他地方颜色改变
        g.setFont(f);//和颜色同理
    }
    public void launchFrame(){
        this.setTitle("飞机大战");//窗口名称
        this.setVisible(true);//窗口可见
        this.setSize(800,800);//窗口大小
        this.setLocation(600,200);//窗口的位置
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口的同时结束程序
        new PaintThread().start();
    }

    public static void main(String[] args) {
        TestJFrame f=new TestJFrame();
        f.launchFrame();
    }
}
