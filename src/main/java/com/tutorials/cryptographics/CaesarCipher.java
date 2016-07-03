package com.tutorials.cryptographics;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CaesarCipher {
	
	
	private int givenKey;
	
	
	public CaesarCipher(int givenKey){
		this.givenKey = givenKey;
	}
	
	
	// our main encrypt method
	public void encryp(InputStream inStr, OutputStream outStr) throws IOException {
		
		boolean done = false;
		while(!done) {
			int next = inStr.read(); // reads next byte
			// if read() methods returns -1 means end of input
			if (next == -1 ) {
				done = true;
			} else {
				byte b = (byte) next; // cast to byte
				byte c = (byte) (b + givenKey); // here is the encryption process - just shift the key by amount
				// write 
				outStr.write(c);
				
			}
			
		}
		
	}
	
	

}
