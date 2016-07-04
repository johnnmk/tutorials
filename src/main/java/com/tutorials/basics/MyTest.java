package com.tutorials.basics;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MyTest {
	
	private static final int COLOR_CODE = 255;
	private static final String INPUT_BASE_DIR = "src/main/resources/tiger.png";
	
	public static void main(String[] args) throws IOException {
		
		BufferedImage original = ImageIO.read(new File(INPUT_BASE_DIR));
	
		int width = original.getWidth();
	    int height = original.getHeight();
		System.out.println(original.getHeight());
		
		
		Graphics graphics = original.getGraphics();
		
		Font font = new Font ("Hello world", Font.BOLD, 12);
		graphics.drawString("hello world", 10, 30);
		for(int y = 0; y < height; y++) {
			for(int x =0; x < width;  x++) {
		
				int rgb = original.getRGB(x, y);
				
				int a = (rgb >> 24) & 0xff; 
				int r = COLOR_CODE - (rgb >> 16 & 0xff);
				int g = COLOR_CODE - (rgb >> 8 & 0xff);
				int b = COLOR_CODE - (rgb & 0xff);
				
				// p = (a<<24) | (r<<16) | (g<<8) | b;
				
				if(rgb != 0) {
					rgb = (a<<24) | (r<<16) | (g<<8) | b;
				}
				original.setRGB(x, y, rgb);
			}
		}
		
		
		boolean write = ImageIO.write(original, "png", new File("src/test/resources/images/output/sky.png"));
		//System.out.println("Done " + write);
	}

}
