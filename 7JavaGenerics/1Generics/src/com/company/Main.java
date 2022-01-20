package com.company;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        //So we've used generics so far in this course and they are very useful and powerful.
        //Function parameters are the names listed in the function's definition. Function arguments are the real values passed to the function.
        //As we can create methods that take arguments in java and we can replace the actual parameters that we declare in the method,
        //Similarly generic allows us to create classes in face of methods that take types as parameters called as type parameter XD.

//        ArrayList list = new ArrayList();//here we didn't specify what type of objects we want in our arrayList.
        ArrayList<Integer> list = new ArrayList<>();//correct way of doing this.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
//        list.add("sad");
        printItems(list);

    }

    public static void printItems(ArrayList obj) {//adding generic here will make type casting obsolete too :)
        for (int i = 0; i < obj.size(); i++) {
            System.out.println((Integer) obj.get(i) * 2);//now we need to cast this to int because java doesn't know what values are there in your list.
            //But the real problem arises if you add a string in your list. Since there is no type-checking done as we didn't mentioned that with ArrayList<?>.
            //Also it won't show any error because acc to java your code is perfectly fine.
            //The problem will occur at runtime! and that is really really bad.
            //By default intelliJ and java compiler are looking at your code and will pop warning regarding this.So the arrayList we used here was of raw type.
            //Avoid using that anytime. Be specific of what type parameter you want in your generics.
            //Before java 1.5 there were no generics and this was the only way to code.
            //Which was a pain in the arse if your working on a big project.
            //now they only left this like this because of backward compatibility, we should never write code like this.
        }
    }
//Now when we provide parameter type to generic it is called parameterized type.Example :- ArrayList<Integer> integerArrayList
}
