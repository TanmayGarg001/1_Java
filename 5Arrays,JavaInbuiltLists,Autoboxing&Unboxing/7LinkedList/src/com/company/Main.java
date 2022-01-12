package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Tanmay", 69.420);
        //We make another customer which is equal to the 1st customer
        Customer anotherCustomer = customer;
        anotherCustomer.setBalance(45.55);
        System.out.println("Name = " + customer.getName() + ", Balance = $" + customer.getBalance());
        //Here another customer is set equal to the 1st customer but changing the balance of anotherCustomer changes the value of balance for the 1st customer too..
        //This happens because both of the objects are accessing the same address in the memory.Because when we create an object unlike primitive data types which
        //have fixed memory space , objects don't have fixed memory space as we don't know what things can a object be made of , so the object stores addresses instead
        //of actual value.
        //So,effectively there is only one object here.
        //Now you might think if java doesn't give you access to pointers why even bother studying about this memory stuff, right?
        //The reason is we need to know this in order to understand the inner workings of LinkedLists etc.
        System.out.println("=============");
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(4);
        integerArrayList.add(5);
        integerArrayList.add(6);

        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println("#" + i + " = " + integerArrayList.get(i));

        }

        integerArrayList.add(1, 45);//works as insert i.e. adds value 45 in the list at 1 and increase the list size by 1
        System.out.println("=============");

        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println("#" + i + " = " + integerArrayList.get(i));

        }

        //Now as we can see to add an element at position 1 we have to make all the other elements shift. So if we have many many many elements its going to take a large time
        //So, this is where LinkedLists shines the brightest.
        //As arrays and arrayLists are basically the same the later being more easy to use and advanced implementation of the array.
        //They are quite good in accessing the elements , like if you know the index of the element ure talking about you can reach to that element in
        //O(1) that is literally in no time. But if want to insert stuff it takes time and if we wanna delete or find an element that also takes time of O(n).

        //In LinkedLists the deletion and insertion can be done in O(1) but we can't access the elements directly in O(1) like we did in the Arrays and ArrayLists.
        //we can find them using loop but time complexity rises to O(n).
        //So it has its pros and cons. There is no SUPER DATA TYPE THAT DOES ALL THE WORK.
        //SEE THE IMAGE FOR BETTER VISUALIZATION.

        //In the images we can see if wanna insert an element we just point the address in sydney to aliceSprings and that to Melbourne and an element gets added in O(1).
        //Similarly in deleting too.And if nothing is pointing or accessing to nothing the element gets destroyed automatically by JavaGarbageCollector.


    }
}
