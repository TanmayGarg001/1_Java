package com.company;

import java.util.HashSet;

//Internally hashSet uses HashMap. But hashMap uses key-value pair, then how does this happens ?
//See the images
public class Main {

    public static void main(String[] args) {
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("Tom");
        stringHashSet.add("Peter");
        stringHashSet.add("Lisa");
        stringHashSet.add("Danny");
        stringHashSet.add("Timmy");

        //internally in hashSet, the add method uses hashmap.put function where the key is the value that we added itself and the value is a constant named as PRESENT.
        //Here present is a object type of final and static variable:-
        //private static final Object PRESENT = new Object();
        //So for all the keys we use the same value i.e. same constant address in the memory.
        //https://www.youtube.com/watch?v=MZL086hmGZ4&list=PLFGoYjJG_fqoDQHufg7XVk-yb2w6CNpgF&index=24
        //check this video and see the debugger tool and oyu will understand what is happening.
        ///Here are some examples of functions that hashSet uses internally

//        public int size() {
//            return map.size();
//        }

//        public boolean isEmpty() {
//            return map.isEmpty();
//        }

//        public boolean add(E e) {
//            return map.put(e, PRESENT)==null;
//        }

//        public boolean contains(Object o) {
//            return map.containsKey(o);
//        }

        stringHashSet.forEach(element -> System.out.print(element + " "));
    }

}
