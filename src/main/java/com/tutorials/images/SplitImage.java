package com.tutorials.images;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SplitImage {
 
    private int rows;
    private int columns;
    private int chuncks;
    private int chunckheigth;
    private int chunckwidth;
    private BufferedImage image;
    private BufferedImage images[];
 
    public SplitImage() {
 
    }
 
    public SplitImage(int rows, int columns, BufferedImage image) {
        this.rows = rows;
        this.columns = columns;
        this.chuncks = this.rows * this.columns;
        this.image = image;
        this.chunckwidth = 102;
        this.chunckheigth = 97;
    }
 
    public BufferedImage[] splitImageNow() throws IOException{
        int count = 0;
        images = new BufferedImage[chuncks];
          for (int x = 0; x < rows; x++) {
            for (int y = 0; y < columns; y++) {
                //Initialize the image array with image chunks
                images[count] = image.getSubimage(0, 0, this.chunckwidth, this.chunckheigth);
                Graphics2D gr = images[count++].createGraphics();
                //gr.drawImage(image, 0, 0,chunckwidth,chunckheigth,null);
                gr.drawImage(image, 0, 0, chunckwidth, chunckheigth, chunckwidth * y, chunckheigth * x, chunckwidth * y + chunckwidth, chunckheigth * x + chunckwidth, null);
                gr.dispose();
            }
    }
         return images;
    }
 
    public void saveImages (BufferedImage[] images) throws IOException {
         for (int i = 0; i < images.length; i++) {
            ImageIO.write(images[i], "png", new File("img" + i + ".png"));
    }
 
    }
}