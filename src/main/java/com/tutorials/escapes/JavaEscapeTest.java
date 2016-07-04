package com.tutorials.escapes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class JavaEscapeTest {

	public static void main(String[] args) throws Exception {

		String html = "<html><head><title>First parse</title></head>"
				  + "<body><p>Parsed HTML into a doc.</p></body></html>";
				Document doc = Jsoup.parse(html);
				
				Document parseHTML = Jsoup.parse(html);
				
				Element element = parseHTML.body();
				
				for(Element nodes: element.getAllElements()){
					
					System.out.println(nodes.text());
				}
				//System.out.println(doc);

	}

}