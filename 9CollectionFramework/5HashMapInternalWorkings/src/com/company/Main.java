package com.company;

import java.util.HashMap;

public class Main {
    //hashmap stores the data in the form of key-pair format
    //It works on the principle of hashing (HASHING IS THE TECHNIQUE USED TO STORE AND RETRIEVE THE DATA IN O(1) TIME!)
    //https://www.youtube.com/watch?v=W5q0xgxmRd8
    //https://www.youtube.com/watch?v=j612Fj-mgCY
    //https://www.freecodecamp.org/news/what-is-hashing/

    //Very imp :- https://www.youtube.com/watch?v=SXfsBDTodpY&list=PLFGoYjJG_fqoDQHufg7XVk-yb2w6CNpgF&index=10
    //Java uses the method hashCode which is included in the topmost Object class in java.
    //See the override method you will see hashCode option.

    //The capacity of an HashMap is the number of buckets in the hash table. The initial capacity is the capacity of an HashMap at the time of its creation.
    //The default initial capacity of the HashMap is 2^4 i.e 16(0 to 15). The capacity of the HashMap is doubled each time it reaches the threshold.

    public static void main(String[] args) {
        //hashCode of the null values are always 0z
        //HashMap maintains the hash,pointer to the next,value and the key.
        //SEE THE IMAGES AND VIDEOS ,this topic has lots of maths and cool things to learn so be prepared and goodLuckHaveFun! :D

        HashMap<String, Integer> marks = new HashMap<>();//use debugger to know more cool stuff and see the hashCode irl
        marks.put("Naveen", 100);
        marks.put("Tom", 200);
        marks.put("Lisa", 300);
        marks.put("Peter", 400);
        marks.put("Robby", 500);

        marks.put(null, 600);
        System.out.println(marks);
        marks.put(null, 700);
        System.out.println(marks);


    }


}
