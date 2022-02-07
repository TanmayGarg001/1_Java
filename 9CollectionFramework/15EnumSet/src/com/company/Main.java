package com.company;
//The Enum in Java is a data type which contains a fixed set of constants.
//It can be used for days of the week (SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, and SATURDAY) ,
//directions (NORTH, SOUTH, EAST, and WEST), season (SPRING, SUMMER, WINTER, and AUTUMN or FALL), colors (RED, YELLOW, BLUE, GREEN, WHITE, and BLACK) etc.
//According to the Java naming conventions, we should have all constants in capital letters. So, we have enum constants in capital letters.
//Java Enums can be thought of as classes which have a fixed set of constants (a variable that does not change). The Java enum constants are static and final implicitly.
//It is available since JDK 1.5.

//EnumSet are way faster, it is not sync. gives performance almost O(1)
//all the elements  are implemented using bitwise arithmetic operations.

import java.util.EnumSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        EnumSet<Language> languages = EnumSet.allOf(Language.class);//this returns enumSet of language type
        System.out.println(languages);

        EnumSet<Language> languages1 = EnumSet.noneOf(Language.class);//this returns none of the specified type
        System.out.println(languages1);

        EnumSet<Language> languages2 = EnumSet.range(Language.PYTHON, Language.CPP);//returns the set in the range including the elements.
        System.out.println(languages2);

        EnumSet<Language> languages3 = EnumSet.of(Language.JAVA, Language.RUBY);//creates enum set of specified languages only
        System.out.println(languages3);

        System.out.println("----------------");
        //add the enumSet of one to another:- (similarly remove,removeAll)
        EnumSet<Language> lang1 = EnumSet.allOf(Language.class);//all elements of Language
        EnumSet<Language> lang2 = EnumSet.noneOf(Language.class);//none elements of Language
        EnumSet<Language> lang3 = EnumSet.noneOf(Language.class);//none elements of Language
        lang2.addAll(lang1);
        lang3.add(Language.JAVASCRIPT);
        System.out.println(lang2);
        System.out.println(lang3);

        System.out.println("===============");

        Iterator<Language> iterator = languages.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        languages.forEach(element -> System.out.print(element + " _ "));

    }

    enum Language {
        JAVA, PYTHON, RUBY, CPP, JAVASCRIPT
    }

}

