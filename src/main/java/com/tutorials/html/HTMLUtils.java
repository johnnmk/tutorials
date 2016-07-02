package com.tutorials.html;

import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;
import java.io.BufferedReader;
import org.jsoup.Jsoup;

public class HTMLUtils {
	private HTMLUtils() {
	}

	public static String extractText(Reader reader) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(reader);
		String line;
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		String textOnly = Jsoup.parse(sb.toString()).text();
		return textOnly;
	}

	public final static void main(String[] args) throws Exception {
		FileReader reader = new FileReader(
				"src/test/resources/html/input.xml");
		System.out.println(HTMLUtils.extractText(reader));
	}
}