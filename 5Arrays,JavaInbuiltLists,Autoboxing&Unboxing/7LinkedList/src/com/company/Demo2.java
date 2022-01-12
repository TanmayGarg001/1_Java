package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo2 {
    //Lets sort the cities in alphabetical order (irl we'll use distance algo to figure out the best path)
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Austria");
        addInOrder(placesToVisit, "Denmark");
        addInOrder(placesToVisit, "China");
        addInOrder(placesToVisit, "Russia");
        addInOrder(placesToVisit, "Switzerland");
        printList(placesToVisit);
        addInOrder(placesToVisit, "Germany");
        printList(placesToVisit);
        placesToVisit.remove(3);
        printList(placesToVisit);

        visit(placesToVisit);

    }


    //Print the elements in the LinkedList
    public static void printList(LinkedList<String> linkedList) {
        System.out.println("=========================");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(" Now visiting = " + iterator.next());
        }
        System.out.println("=========================");
    }

    //function that add places to visit in alphabetical order
    public static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();//makes a cap thingy ' ^ '.
        //ListIterator is better than iterator as it offer features like previous to go forward and backward on looping which we can't do with normal iterator by default.
        while (stringListIterator.hasNext()) {//checks if the linked list has another item
            int comparison = stringListIterator.next().compareTo(newCity);//returns 0 if equal 1 if greater and less than 0 if smaller
            if (comparison == 0) {
                //does nothing as destination already exists!
                System.out.println(newCity + " already included as a destination.");
                return false;
            } else if (comparison > 0) {
                //now we need to add the newCity before the one we are comparing too but the cap^ is currently after that. So we need to back and add the city there.
                //Adelaide should be added before Brisbane.
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                //moves to the next city
            }

        }
        stringListIterator.add(newCity);
        return true;
    }

    public static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forwardDirection = true;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if (cities.isEmpty()) {
            System.out.println("No cities present");
        } else {
            System.out.println("Now visiting " + listIterator.next());//outputs 1st city
            printMenu();
        }
        while (!quit) {
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    System.out.println("Vacation is over!");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting = " + listIterator.next());
                    } else {
                        System.out.println("Reached at last spot.");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting = " + listIterator.previous());
                    } else {
                        System.out.println("Reached at starting spot.");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
                //This type of code makes one think real hard and its real good if you think so what is actually happening behind the scenes.
            }
        }
        //this will return one city two times if we change the direction of transversal
        //As for why it does that, it has quite good reason for that:-
        //it would result in infinite loop
        //to overcome this overlapping condition we need to track the direction
        //THIS MAY SOUND SIMPLE BUT SOME ALGOS HAVE BUILT NEGLECTING THIS FACT AS IT WAS NOT DETECTED.
        //ALGO LIKE TORTOISE AND THE HARE ALGO HAD THIS PROBLEM OF INFINITE LOOPING.
        //So do all this stuff carefully!
    }

    public static void printMenu() {
        System.out.println("Enter 0: To end the vacation");
        System.out.println("Enter 1: To go to the next spot");
        System.out.println("Enter 2: To go to previous spot");
        System.out.println("Enter 3: To print the instructions again");
    }

}

//Link to understand it even better:-
//https://www.udemy.com/course/java-the-complete-java-developer-course/learn/lecture/3646052#questions/7999982
// In a nutshell the iterator is setup to return the value it just jumped over.So we need .next() to access 1st entry in list as it jumps over it.
//In Java we have doubly linked list that's why we can move forward and backward.