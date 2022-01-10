package com.company;

public class Main {
    //if you want to resize your array, the very first thing that comes to our mind is too make a new array and copy the elements of original one to that.But that
    //is another array you're making ,lets say we don't want to do that.So, what we do is we make another array and we make both array same like
    //int[] original = baseData;//here baseData is the original array with size let's say 10.
    //Now remake the baseData that is make ot to point to another block in the memory .
    //i.e.baseData = new int[12]
    //here we rewrite the contents of the original array to that only by making it point to another address.By doing this we made the original array preserve the data.
    //but the original array has to be static in this case so that it changes all the instances of it in the program.
    //we can use manual array copy provided with java,or make a new array and then copy the elements of original array to new one or we could do the way mentioned above,
    //but all these ways of resizing an array are not quite useful when data is dynamic in nature and there is a lot of data. As to manage the array by using these
    //will be pain in the ass. This problem arises doe to the fact arrays are stored in the memory as continuous block.

    //To overcome this problem,
    //We use Array Lists.
    //List is an interface in java and Array Lists inherits from AbstractLists which implements List interface.
    //You will come know what a Interface is eventually.Also List interface extends the Collection interface.
    //So the array list is nothing but a resizable array.So it handles the resizing automatically , that's the cool part.So every time we don't have to manually write the code
    //like we did in arrays.It handles everything inside internally,not only size but also the memory.

    //Let's make a program that makes a grocery lists using ArrayLists.

    public static void main(String[] args) {

        //maneuver to grocery list to see how perform addition  deletion insertion in array lists.
        GroceryList groceryList = new GroceryList();
        groceryList.printGroceryList();
        groceryList.addGroceryItem("Milk");
        groceryList.addGroceryItem("Tea");
        groceryList.addGroceryItem("Coffee");
        groceryList.addGroceryItem("Chips");
        groceryList.addGroceryItem("Cheese");
        groceryList.addGroceryItem("Sugar");
        groceryList.printGroceryList();
        groceryList.removeGroceryItem(3);
//        groceryList.removeGroceryItem("Coffee");
        groceryList.printGroceryList();
        groceryList.addGroceryItem("pop-corn");
        groceryList.addGroceryItem("chocolate");
        groceryList.addGroceryItem("coke");
        groceryList.printGroceryList();
        groceryList.removeGroceryItem("Cheese");
        groceryList.printGroceryList();
        groceryList.modifyGroceryItem(1, "Wine");
        groceryList.printGroceryList();
        groceryList.searchForItem("chocolate");


    }
}
