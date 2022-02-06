package com.company;

import java.util.Vector;

public class Main2 {

    public static void main(String[] args) {

        Vector<String> languages = new Vector<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Ruby");
        languages.add("JavaScript");
        languages.add("C#");

        Vector<String> languages2 = new Vector<>();
        languages2.add("TEMP_Java");
        languages2.add("TEMP_Python");
        languages2.add("TEMP_Ruby");
        languages2.add("TEMP_JavaScript");
        languages2.add("TEMP_C#");

        System.out.println(languages);

        //it is only used as a raw type, generic does not support this
        Vector stringVector = new Vector();
        stringVector.add(languages);
        stringVector.add(languages2);

        for (int i = 0; i < languages.size(); i++) {
            //change get 1 to 0 you will see that we are dealing with vector inside a vector.
            System.out.println(((Vector) (stringVector.get(1))).get(i));//we have to type cast it too
        }

    }

}
