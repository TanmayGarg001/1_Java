package com.company;
//Features of ArrayList:-
//1.Ordered values
//2.Random Access
//3.Duplicate elements
//4.Null element
//5.Increase its size by 50% when exhausts and copy all the elements to new memory block.

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Array list is a dynamic array
        int[] array = new int[4];//array of 4 values inside it(static array)
        for (int i = 0; i < 3; i++) {//the last value in the array will always be 0 by default.
            array[i] = (int) (Math.random() * 5);
        }
        System.out.println(Arrays.toString(array));
        //array[5]=44;//doing this will result in Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
        //this happens because we define size initially whilst creating the array, so the memory block is accordingly allocated.
        //same with negative index

        //ArrayList increase its size by 50% each time it gets exhausted.
        //Vector increase its size by 100%(doubles itself) each time it gets exhausted.
        //link:- https://www.javatpoint.com/difference-between-arraylist-and-vector

        //we can make arrayLists by various ways
        ArrayList arrayList = new ArrayList();
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(10, 20, 15, 30));//directly appends the numbers to the list.
        System.out.println(arrayList1);
        arrayList.add("Timmy");
        arrayList.add(54);
        arrayList.add('s');
        arrayList.add(-98.45);
        arrayList.add(null);
        System.out.println(arrayList);
        //here as you see, java will give you warning that arrayList is not parameterized or in other words we are using raw arrays which in not recommended for obvious reasons.
        //we can overcome that by doing this :-
        System.out.println("=====================");
        ArrayList<Object> arrayList2 = new ArrayList<>();
        arrayList2.add("Timmy");
        arrayList2.add(54);
        arrayList2.add('s');
        arrayList2.add(-98.45);
        arrayList2.add(null);
        System.out.println(arrayList2);
        //this is also not recommended because what we did there was make Object ArrayList and Object is literally the topmost class in java!
        //So it is pretty much the same as we did before
        System.out.println(arrayList2.get(2));
        System.out.println(arrayList2.size());
        arrayList2.set(0, 12);
        System.out.println(arrayList2);
        System.out.println("==============");
        //When we first create an ArrayList object, the size of the internal array is 10 i.e. default initial capacity of the ArrayList.Actual or the physical size is still 0.
        //But java sort of reserves 10 spots when you create that virtually.Here virtually means that it is not stored in memory actually.
        //add some debugger and check it out its really amazing
        //ArrayList capacity is the maximum number of elements it can hold without resizing the internal array.
        //The size of ArrayList is the number of elements it currently has. See the below example for more details.
        ArrayList<Integer> integerArrayList = new ArrayList<>();//generic array list WrapperClass Integer, mostly we do it like this.
        System.out.println(integerArrayList.size());//PC = 0
        integerArrayList.add(45);
        System.out.println(integerArrayList.size());//PC = 1 , Here check the virtual capacity using debugger you will see that 9 elements are equal to null
        integerArrayList.add(88);
        integerArrayList.add(124);
        integerArrayList.add(98);
        integerArrayList.add(92);
        System.out.println(integerArrayList.size());//Pc =4
        System.out.println("=========================");
        //let's say you want to change the virtual capacity of the arrayList, to do that pass the value you want to allocate virtually
        ArrayList<Integer> integerArrayList2 = new ArrayList<>(20);
        System.out.println(integerArrayList2.size());
        integerArrayList2.add(44);
        System.out.println(integerArrayList2.size());

    }
}
