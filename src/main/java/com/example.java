package com.example;

import com.google.common.collect.ImmutableList;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;

public class Main {
    public static void main(String[] args) {
        ImmutableList<String> list = ImmutableList.of("Hello", "World");
        System.out.println(StringUtils.join(list, " "));

        // Jsoup vulnerability, should trigger a warning
        String html = "<p>Test</p>";
        Jsoup.parse(html);
    }
}
