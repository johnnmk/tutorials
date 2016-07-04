package com.tutorials.texts;

public class Z {
	public static void main(String[] args) {
		String boldGrayLine = "\033[1mThis is a BOLD line\033[0m";
		String setBold = "\033[1mThis keeps it bold.";
		String normalLine = "This is a normal (default) line";
		String setNormal = "\033[0mThis un-bolds it.";
		System.out.println(normalLine);
		System.out.println(boldGrayLine);
		System.out.println(normalLine);
		System.out.println(setBold);
		System.out.println(normalLine);
		System.out.println(setNormal);
		System.out.println(normalLine);
	}
}