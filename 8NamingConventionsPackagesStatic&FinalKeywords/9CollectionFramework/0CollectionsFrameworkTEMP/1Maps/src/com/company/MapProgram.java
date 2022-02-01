package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapProgram {
    //If you named this class as Map then error would pop up as you would be making Map object in Map class that you made
    //But you can get around that using java.util.Map, but its pain in the ass to write that much of a code each time.
    //Each key, value pair is called as an entry.
    //https://www.geeksforgeeks.org/map-interface-java-examples/

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();//stores in the order <key,value>
        languages.put("Java", "Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.");
        languages.put("JavaScript", "JavaScript is high-level, often just-in-time compiled, and multi-paradigm language.");
        languages.put("C++", "C++ is a general-purpose programming language created by Bjarne Stroustrup as an extension of the C programming language.");
        languages.put("Swift", "Swift is a general-purpose, multi-paradigm, compiled programming language developed by Apple Inc.");

        System.out.println(languages.get("Java"));
        languages.put("Swift", "This is getting overwritten!");
        System.out.println(languages.get("Swift"));
//        for (int i = 0; i < languages.size(); i++) {
//            System.out.println("Key = "+""+"\n Value = "+languages.get(i));
//        }

        System.out.println("============================================");

        System.out.println(languages.put("Python", "Python is an interpreted high-level general-purpose programming language."));
        languages.put("Python", "We can check with key if the value is null or value already exists.");
        System.out.println(languages.put("Python", "Python is an interpreted high-level general-purpose programming language."));
        System.out.println(languages.get("Python"));

        System.out.println("============================================");

        if (languages.containsKey("Java")) {
            System.out.println("Java is already a key in the map");
        } else {
            languages.put("Java", "Here we go!");
            System.out.println(languages.get("Java"));
        }

        System.out.println("============================================");

        if (languages.containsKey("CSS")) {
            System.out.println("CSS is already a key in the map");
        } else {
            languages.put("CSS", "Here we go!");
            System.out.println(languages.get("CSS"));
        }
        System.out.println("============================================");
        //another method like put if absent which only puts if key doesn't exist previously in the map.Mainly plays role in concurrency issues.
        languages.putIfAbsent("C#", "See it works");
        System.out.println(languages.get("C#"));
        languages.putIfAbsent("C#", "Now it won't put it!");
        System.out.println(languages.get("C#"));


        System.out.println("============================================");
        System.out.println(languages);
        System.out.println("============================================");
//        Let's print all the entries in the Map using a loop :-
        //HashMap entries are not in sync order for that used LinkedHaspMap
        Iterator<String> iterator = languages.keySet().iterator();
        Iterator<String> iterator2 = languages.values().iterator();
        while (iterator.hasNext() && iterator2.hasNext()) {
            System.out.print("Key = " + iterator.next());
            System.out.print(",Value = " + iterator2.next() + "\n");
        }
        languages.put("Test", "random stuff");
        System.out.println("============================================");
        System.out.println("============================================");
        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

        System.out.println("============================================");
        System.out.println("============================================");
        //the remove method does return true/false
        languages.remove("C++");
        if (languages.remove("Swift", "Test!")) {
            System.out.println("removed swift!");
        } else {
            System.out.println("invalid key/value pair");
        }
        //replace the value for the specified key
        languages.replace("CSS", "Cascading style sheets");
        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
    //Both the keys and the values can be any object.You can make a map inside map,tho its not recommended XD.
}
//Unlike other languages such as python for example :- there is no requirement that the key must be immutable (unchanging). Immutable objects are things like
//Strings and integers whose value can't change. Wx:- when we assign a new string value to a string variable, what we are doing is we are changing the value that
//variable holds, we're not changing the string. In other words keys can't be changed.
//Also its not permitted for a map to contain itself as a key LOL ofc.

//Now let's make a game in JAVA boiiiiiiiiiiiii.