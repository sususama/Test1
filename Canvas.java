package edu.xatu;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Canvas extends JPanel {//画布
    private Interface anInterface=null;
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
        g.drawImage(beijing,0,0,null);

    }
}
