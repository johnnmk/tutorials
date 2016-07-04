package com.tutorials.security;

import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class MyEncryptionDecryptionAES {

	static Cipher cipher;
	
	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException {
		
		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		keyGenerator.init(128);
		SecretKey secretKey = keyGenerator.generateKey();
		cipher = Cipher.getInstance("AES");
		
		System.out.println(cipher.getAlgorithm());
	}
}
