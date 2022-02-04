package com.company;

//Interview questions related to collectionFramework do see them they are very important!

public class Interview {

    public static void main(String[] args) {

        System.out.println("https://www.youtube.com/watch?v=eKoeKQ2yGjU&list=PLFGoYjJG_fqoDQHufg7XVk-yb2w6CNpgF&index=15");

        //1.HashMap works on the principle of Hashing internally :- one bucket stores key,value,hashCode,index (which is one part of one element). Bucket can have more than one
        //elements and the data is organized in linked list in it and when it reaches a certain threshold (8 elements) it changes into tree data structure.

        //2.To make a hashMap of user-defined classes, we need to implement hashCode method(), .equals() (which is used at the time of get) method and proper implementation.

        //3.If we store same key again the value is over-written in hashMap.

        //4&5.We can store one null key and multiple null values in hashMap.

        //6.HashMap handles collision using linkedList till 8 elements are reaches in the same bucket after that it uses tree to organize.
        // The threshold of switching to the balanced tree is defined as TREEIFY_THRESHOLD constant in java. util. HashMap JDK 8 code.
        ////Currently, its values are 8, which means if there are more than 8 elements in the same bucket than HashMap will use a tree (balanced binary tree)
        ////instead of a linked list to hold them in the same bucket.

        //7.HashMap represent HashTable data structure and internally at time of collisions it maintains linkedList too.

        //8.Map interface is used and HashMap represent HashTable data structure and internally at time of collisions it maintains linkedList too.

        //9.We can't store duplicate keys in hashMap if we try to it will overwrite the value but it won't give you an error, but it will show warnings.

        //10.Yes we can store duplicate values in a hashMap.

        //11.HashMap is not thread safe in java.We have to use ConcurrentHashMap(syncing at segment level!) or sync map.

        //12.If we use hashMap in multithreading application we will get unexpected results or the data might get corrupted.

        //13.We can iterate hashMap using iterator, entrySet, enhanced For loop, lambda etc.

        //14.To remove a mapping we use remove method that removes key and value pair in map.

        //15.Mappings are stored in random order in hashMap, to store data order wise we use LinkedHashMap. Depends on the inner implementation we are using.

        //16.We can't sort hashMap in java, if we want to we have to convert into linkedHashMap or TreeMap.

        //17.A load factor is a number that controls the resizing of a hashMap.When a number of elements in the hashMap cross the load factorThe load factor
        //is the measure that decides when to increase the capacity of the Map. The default load factor is 75% of the capacity. The threshold of a HashMap
        //is approximately the product of current capacity and load factor. Rehashing is the process of re-calculating the hash code of already stored entries.

        //Load factor is 100 in arrayList etc.

        //18.Initially hashMap has 16 buckets.The initial capacity of the HashMap is the number of buckets in the hash table.
        // It creates when we create the object of HashMap class. The initial capacity of the HashMap is 24, i.e., 16.
        // The capacity of the HashMap is doubled each time it reaches the threshold. The capacity is increased to 25=32, 26=64, and so on.

        //19.HashMap holds the values in an array, which can hold up to Integer.MAX_VALUE. But this does not count collisions. Each Entry has a next field, which is also an entry.
        // This is how collisions (two or more objects with the same hashcode) are resolved. So I wouldn't say there is any limit (apart from the available memory)
        //Note that if you exceed Integer.MAX_VALUE, you'll get unexpected behaviour from some methods, like size(), but get() and put() will still work.
        // And they will work, because the hashCode() of any object will return an int, hence by definition each object will fit in the map.
        // And then each object will collide with an existing one.

        //20.The capacity denotes how many entries HashMap can store, and size denotes how many mappings or key/value pair is currently present.
        //The basic difference is that the current capacity in hashmap gives the size gives the number of elements currently being held by hashmap whereas,
        //capacity gives the number of elements it can hold.
        //For example :
        //Default value of capacity of hashmap is set to 16
        //Threshold value(which is equal to load factor*current capacity) which is 0.75*16 = 12, hashmap gets rebuilt.
        //So when you add the 13th element in the hashmap, it gets rebuilt with capacity twice the size of hashmap.

        //21.If many keys have same hashCode, collision occurs and element is appended in linkedList or tree(after JDK 1.8) depends on the bucketSize.

    }

}
