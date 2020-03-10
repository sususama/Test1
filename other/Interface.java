package edu.xatu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Interface extends JFrame {//容器
    Image beijing;

    {
        try {
            beijing= GameUtil.getImage("tupian/背景.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(beijing,10,20,null);
    }
    public Interface(){
        super("花店管理");
        this.setSize(500,667);//设置界面大小
        this.setLocation(650,130);//设置初始位置
        this.setVisible(true);//显示窗口
    }
}
