package com.tutorials.htmls;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Whitelist;

public class HTMLParserExample {

	public static void main(String[] args) {

		StringBuffer html = new StringBuffer();

		html.append("<!DOCTYPE html>");
		html.append("<html lang=\"en\">");
		html.append("<head>");
		html.append("<meta charset=\"UTF-8\" />");
		html.append("<title>Hollywood Life</title>");
		html.append("<meta name=\"description\" content=\"The latest entertainment news\" />");
		html.append("<meta name=\"keywords\" content=\"hollywood gossip, hollywood news\" />");
		html.append("</head>");
		html.append("<body>");
		html.append("<div id='color'>This is red</div> />");
		html.append("</body>");
		html.append("</html>");

		Document doc = Jsoup.parse(html.toString());

		String title = doc.title();
		
		System.out.println("Title is " + title);
		// get meta description content
		String description = doc.select("meta[name=description]").get(0)
				.attr("content");
		System.out.println("Meta description : " + description);

		// get meta keyword content
		String keywords = doc.select("meta[name=keywords]").first()
				.attr("content");
		System.out.println("Meta keyword : " + keywords);

		String color1 = doc.getElementById("color").text();
		String color2 = doc.select("div#color").get(0).text();

		System.out.println(color1);
		System.out.println(color2);
		
		
		
		String dirtyHTML = "<p><a href='http://howtodoinjava.com/' onclick='sendCookiesToMe()'>Link</a></p>";
		 
		String cleanHTML = Jsoup.clean(dirtyHTML, Whitelist.basic());
		 
		System.out.println(cleanHTML);

	}

}