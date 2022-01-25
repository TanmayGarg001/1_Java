package com.company;//there will be folder inside com named company that will have .java file and when we compile the code intelliJ makes new folder named as out with
//import org.w3c.dom.Node;

//.class file in it
public class Main {

    public static void main(String[] args) {

        //https://www.youtube.com/watch?v=luxOkCvJBcQ&list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q&index=63
        //https://www.youtube.com/watch?v=k7TwStbkK70&list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q&index=65
        //https://www.youtube.com/watch?v=av816KIz8nM&list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q&index=66

        //Now think of packages as a way of grouping related classes and interfaces together.
        //So the actual package mechanism provides a way to manage the namespace of object types and it also extends access protection beyond the traditional access
        // modifiers we see:- public,private etc.

        //Now lets make a an object called node intelliJ shows multiple imports that have class of name Node in them.
        //some from oracle some from amazon some from javafx etc etc.

        //  Node node = null;//you use only amazon's so there will be no name conflict but still its important to understand

        //now to overcome name conflicts what we do is:-
        org.w3c.dom.Node node = null;//this way we could use same class name but for different purposes.
        //java will give us error if there is a naming conflict in imports
        //see the image why we use packages

    }

    //Now we are using the packages throughout this course and it is almost impossible to write a code without using imports or packages basically.
    //Example:- java.util.Scanner , java.util.ArrayList etc.
    //Even when there is no import statement written the java is importing from java.lang package. which is used to make all
    // the classes and Integers,Doubles etc. and fundamental building blocks of a java program.
    //Open the other project to learn more!
}
