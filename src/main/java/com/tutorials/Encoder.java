package com.tutorials;
import org.jsoup.Jsoup;

public class Encoder {
    public static void main(String args[]) {
        String s = Jsoup.parse("&lt;Fran&ccedil;ais&gt;").text();
        System.out.print(s);
    }
}