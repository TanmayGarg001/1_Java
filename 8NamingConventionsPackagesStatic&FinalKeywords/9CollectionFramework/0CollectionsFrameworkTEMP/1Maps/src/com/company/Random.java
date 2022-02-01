package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class Random {
    public static void main(String[] args) {

        Map<String, String> languages = new LinkedHashMap<>();
        languages.put("Java", "Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.");
        languages.put("JavaScript", "JavaScript is high-level, often just-in-time compiled, and multi-paradigm language.");
        languages.put("C++", "C++ is a general-purpose programming language created by Bjarne Stroustrup as an extension of the C programming language.");
        languages.put("Swift", "Swift is a general-purpose, multi-paradigm, compiled programming language developed by Apple Inc.");
        languages.put("Test", "random stuff");
        languages.putIfAbsent("C#", "See it works");
        System.out.println(languages.get("C#"));
        languages.putIfAbsent("C#", "Now it won't put it!");
        System.out.println(languages.get("C#"));
        System.out.println("============================================");
        System.out.println("============================================");
        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

        languages.remove("C++");
        languages.remove("Swift", "Test!");
        System.out.println("============================================");
        System.out.println("============================================");
        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
