package com.tutorials;

import java.io.UnsupportedEncodingException;

public class Base64Test {
	
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		
		String original = "hello world";
		
		byte [] utf8Bytes = original.getBytes("UTF8");
		
		System.out.println(utf8Bytes);
		
		
	}

}
