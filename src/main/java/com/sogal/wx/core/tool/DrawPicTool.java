package com.sogal.wx.core.tool;

import org.apache.commons.lang3.StringUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by xiaoxuwang on 2019/4/18.
 */
public class DrawPicTool {

    public static void drawImgInImg(BufferedImage baseImage, BufferedImage imageToWrite, int x, int y, int width, int heigth) {
        Graphics2D g2D = (Graphics2D) baseImage.getGraphics();
        g2D.drawImage(imageToWrite, x, y, width, heigth, null);
        g2D.dispose();
    }
    //length = 725 - 75
    public static void drawTextInImg(BufferedImage baseImage, String textToWrite, int x, int y, int length, int size, Color color) {
        Graphics2D g2D = (Graphics2D) baseImage.getGraphics();
        g2D.setColor(color);
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2D.setFont(new Font("Microsoft YaHei", Font.PLAIN, size));
        int eachLineCharNum = length/size;
        int strSize = textToWrite.length();
        String line1 = strSize<=eachLineCharNum?textToWrite:textToWrite.substring(0, eachLineCharNum);
        String line2 = strSize>eachLineCharNum?textToWrite.substring(eachLineCharNum, strSize):null;
        g2D.drawString(line1, x, y);
        if(!StringUtils.isBlank(line2)){
            g2D.drawString(line2, x, y+size+16);
        }
        g2D.dispose();
    }

    public static void drawTextInImg(BufferedImage baseImage, String textToWrite, int x, int y, int length) {
        drawTextInImg(baseImage, textToWrite, x, y, length, 35, new Color(0, 0, 0, 238));
    }

    public static void drawTextWithFontHeightInImg(BufferedImage baseImage, String textToWrite, int x, int y, int length, int size, Color color) {
        Graphics2D g2D = (Graphics2D) baseImage.getGraphics();
        g2D.setColor(color);
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2D.setFont(new Font("Microsoft YaHei", Font.PLAIN, size));
        if(size == 0){
            size =35;
        }
        int eachLineCharNum = length/size;
        int strSize = textToWrite.length();
        String line1 = strSize<=eachLineCharNum?textToWrite:textToWrite.substring(0, eachLineCharNum);
        String line2 = strSize>eachLineCharNum?textToWrite.substring(eachLineCharNum, strSize):null;
        FontMetrics fontMetrics = g2D.getFontMetrics();
        int height = fontMetrics.getHeight();
        y = y + (height/4)*3;
        g2D.drawString(line1, x, y);
        if(!StringUtils.isBlank(line2)){
            g2D.drawString(line2, x, y+size+16);
        }
        g2D.dispose();
    }
    public static void drawTextWithFontHeightInImg(BufferedImage baseImage, String textToWrite, int x, int y, int length) {
        drawTextWithFontHeightInImg(baseImage, textToWrite, x, y, length, 35, new Color(0, 0, 0, 238));
    }

    public static void drawTextWithFontHeightInImg(BufferedImage baseImage, String textToWrite, int x, int y, int length, int articleTitleSize) {
        drawTextWithFontHeightInImg(baseImage, textToWrite, x, y, length, articleTitleSize, new Color(0, 0, 0, 238));
    }

    public static void drawNickNameTextWithLengthInImg(BufferedImage baseImage, String textToWrite, int x, int y, int length, int nickNameSize, int nickNameLength, Color color) {
        Graphics2D g2D = (Graphics2D) baseImage.getGraphics();
        g2D.setColor(color);
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2D.setFont(new Font("Microsoft YaHei", Font.PLAIN, nickNameSize));
        int strSize = textToWrite.length();
        String line1;
        String line2 = null;
        if(nickNameLength >0 && strSize > nickNameLength ){
            textToWrite = textToWrite.substring(0, nickNameLength);
            line1 = textToWrite + "...";
        }else if(nickNameLength == 0){
            if(nickNameSize == 0){
                nickNameSize = 28;
            }
            int eachLineCharNum = length/nickNameSize;
            line1 = strSize<=eachLineCharNum?textToWrite:textToWrite.substring(0, eachLineCharNum);
            line2 = strSize>eachLineCharNum?textToWrite.substring(eachLineCharNum, strSize):null;
        }else {
            line1= textToWrite;
        }
        FontMetrics fontMetrics = g2D.getFontMetrics();
        int height = fontMetrics.getHeight();
        y = y + (height/4)*3;
        g2D.drawString(line1, x, y);
        if(!StringUtils.isBlank(line2)){
            g2D.drawString(line2, x, y+nickNameSize+16);
        }
        g2D.dispose();
    }
}
