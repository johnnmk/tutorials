package com.tutorials.cryptographics;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MyCryptographyTest {

	private static final String INPUT_BASE_DIR = "src/main/resources/tiger.png";
	private static final String OUTPUT_BASE_DIR = "src/test/resources/images/output/";

	public static void main(String[] args) throws IOException {
		
		
		//new MyCryptographyTest().loadImage(INPUT_BASE_DIR, 270, 270);

		new MyCryptographyTest().loadImage(INPUT_BASE_DIR);
	}
	
	public boolean loadImage(String PATH_IMAGE) throws IOException {
		
		// preverse original Image
		BufferedImage temp = null;

		BufferedImage original = ImageIO.read(new File(PATH_IMAGE));
		/*int width = Math.max(original.getWidth(), x);
		int height = Math.max(original.getHeight(), y);*/
		
		//temp = new BufferedImage(original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_RGB);
		
		
		 //get image width and height
	    int width = original.getWidth();
	    int height = original.getHeight();
	    //convert to negative
	    for(int y = 0; y < height; y++){
	      for(int x = 0; x < width; x++){
	        int p = original.getRGB(x,y);
	        int a = (p>>24)&0xff;
	        int r = (p>>16)&0xff;
	        int g = (p>>8)&0xff;
	        int b = p&0xff;
	        //subtract RGB from 255
	        r = 255 - r;
	        g = 255 - g;
	        b = 255 - b;
	        //set new RGB value
	        p = (a<<24) | (r<<16) | (g<<8) | b;
	        original.setRGB(x, y, p);
	      }
	    }
	
		Graphics graphics = original.getGraphics();
		String str = "Hell World ";
		Font font = new Font(str,Font.BOLD, 25);
		graphics.setFont(font );
		graphics.drawString(str, 100, 50);
		graphics.dispose();

		return ImageIO.write(original, "png", new File(OUTPUT_BASE_DIR+ "skyout.png"));
	}
}









