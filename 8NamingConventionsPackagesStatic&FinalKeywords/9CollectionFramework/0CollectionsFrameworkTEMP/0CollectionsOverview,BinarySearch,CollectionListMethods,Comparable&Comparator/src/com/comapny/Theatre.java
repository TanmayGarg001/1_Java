package com.comapny;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theatre {

    public final String theatreName;
    private final int seatsPerRow;
    public List<Seat> seats = new ArrayList<>();//change this to any type of list and it still works!
    //furtherMore we can change that List to collection too!, provided that you coded that way.
    //try different data structures in collection framework to fuck around

    public Theatre(String theatreName, int numberOfRows, int seatsPerRow) {
        this.seatsPerRow = seatsPerRow;
        this.theatreName = theatreName;
        int lastRow = 'A' + (numberOfRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNumber = 1; seatNumber <= seatsPerRow; seatNumber++) {
                Seat seat = new Seat("| " + row + String.format("%02d |", seatNumber));//do one conversion Java will do the other for you
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return "You are currently visiting = " + theatreName + "\n";
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("No seat " + seatNumber);
            return false;
        }
//        for (Seat seat : seats) {
//            System.out.print(".");//just to check the number of iterations
//            if (seat.getSeatID().equals(seatNumber)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//        if (requestedSeat == null) {
//            System.out.println("No seat " + seatNumber);
//            return false;
//        }
//        return requestedSeat.reserve();
    }

    //This getSeats() method will work for mostly all collections
    //    public void getSeats() {
//        int temp = 0;
//        for (Seat seat : seats) {
//            System.out.println(seat.getSeatID());
//            temp++;
//            if (temp % seatsPerRow == 0) {
//                System.out.println();
//                for (int j = 0; j < seatsPerRow * 8; j++) {
//                    System.out.print("-");
//                }
//                System.out.println();
//            }
//        }
//    }
    public void getSeats() {
        int temp = 0;
        for (int i = 0; i < seats.size(); i++) {
            Seat seat = seats.get(i); //.get() is not used in all interfaces
            System.out.print(seat.getSeatID() + " ");
            temp++;
            if (temp % seatsPerRow == 0) {
                System.out.println();
                for (int j = 0; j < seatsPerRow * 8; j++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        }

    }

    public class Seat implements Comparable<Seat> {
        private final String seatID;
        private boolean reserved = false;

        public Seat(String seatID) {
            this.seatID = seatID;
        }

        private boolean reserve() {
            if (!reserved) {
                reserved = true;
                System.out.println(seatID + " was reserved!");
                return true;
            } else {
                System.out.println(seatID + " Seat already reserved.");
                return false;
            }
        }

        public String getSeatID() {
            return seatID;
        }

        public boolean cancel() {
            if (reserved) {
                reserved = false;
                System.out.println(seatID + " reservation has been cancelled.");
                return true;
            } else {
                System.out.println("Seat is not reserved!");
                return false;
            }
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatID.compareToIgnoreCase(seat.getSeatID());
        }
    }
    //Comparable  = compareTo is used to compare something to another and return the values according to that.
    //https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/

    //Consider a Movie class that has members like, rating, name, year. Suppose we wish to sort a list of Movies based on year of release.
    //We can implement the Comparable interface with the Movie class, and we override the method compareTo() of Comparable interface.

    //Now, suppose we want sort movies by their rating and names also. When we make a collection element comparable(by having it implement Comparable),
    //we get only one chance to implement the compareTo() method. The solution is using Comparator.

    //Unlike Comparable, Comparator is external to the element type we are comparing. It’s a separate class.
    //We create multiple separate classes (that implement Comparator) to compare by different members.

    //Collections class has a second sort() method and it takes Comparator. The sort() method invokes the compare() to sort objects.
    //To compare movies by Rating, we need to do 3 things :
    //Create a class that implements Comparator (and thus the compare() method that does the work previously done by compareTo()).
    //Make an instance of the Comparator class.
    //Call the overloaded sort() method, giving it both the list and the instance of the class that implements Comparator.
    //To summarize, if sorting of objects needs to be based on natural order then use Comparable whereas if you sorting needs to be done on
    // attributes of different objects, then use Comparator in Java.
}
