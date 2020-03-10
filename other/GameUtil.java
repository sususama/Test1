package edu.xatu;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class GameUtil {
    private GameUtil(){

    }

    /*
     *讲想画的图片的路径传进去
     * */

    public static Image getImage(String path) throws IOException {
        BufferedImage bi=null;
        URL u=GameUtil.class.getClassLoader().getResource(path);
        bi= ImageIO.read(u);
        return bi;
    }
}
