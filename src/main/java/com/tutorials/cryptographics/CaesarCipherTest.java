package com.tutorials.cryptographics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CaesarCipherTest {
	
	public static void main(String[] args) {
		
		try {
			
			/*InputStream inStr = new FileInputStream("src/main/resources/input.txt");
			OutputStream outStr = new FileOutputStream("src/main/resources/output.txt");*/
			
			InputStream inStr = new FileInputStream("src/main/resources/output.txt");
			OutputStream outStr = new FileOutputStream("src/main/resources/outputresult.txt");
			
			// our cipher object
			CaesarCipher cipher = new CaesarCipher(-5); // to decrypt back simple use negative key
			cipher.encryp(inStr, outStr);
			inStr.close();
			outStr.close();
		} catch (IOException e) {
			System.out.println("Error " + e);
		}
	}
}
