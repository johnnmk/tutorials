package com.tutorials;

import java.util.ArrayList;
import java.util.List;

public class HooksTest {
	
	public static void main(String[] args) {
		
		
		// rdar\:\/\/problem\/\d{8}\D
		String str = "rdar\\:\\/\\/problem\\/\\d{8}\\D";
		
		//rdar://problem/26771174 Hello world 
		
		String str2 ="rdar://problem/26771174/";
		
		boolean matches = str2.matches(str);
		
		System.out.println("Rader " + matches);
		
		List<String> input = new ArrayList<String>();
		input.add("123-45-6789");
		input.add("9876-5-4321");
		input.add("987-65-4321 (attack)");
		input.add("987-65-4321 ");
		input.add("192-83-7465");


		for (String ssn : input) {
			if (ssn.matches("^(\\d{3}-?\\d{2}-?\\d{4})$")) {
				System.out.println("Found good SSN: " + ssn);
			}
		}
    }

}
