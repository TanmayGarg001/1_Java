package com.company;

public class Greeter {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.greet();

        HelloImplementation helloImplementation = new HelloImplementation();
        greeter.greet2(helloImplementation);//here we are passing a behaviour to greet method.
        //But here we are passing a thing that has a behaviour.
        //Lambdas let you do that, they are not a function of any class! So they are functions which exists in isolation.
        //And they can be used as values.
        Greeting lambda = () -> System.out.println("Hello");
        //Now what is the difference between line 9 and 14?
        System.out.println("============");
        helloImplementation.perform();
        lambda.perform();//Here you see the magic, so the lambda expression is behaving like an implementation of that interface.
        //So in line 9 we created a class and that implemented the greeting interface, and then we provide the logic inside that class.
        //But in line 14 we are just creating a function and that is getting assigned to Greeting.
        //Now if you think about it wasn't really necessary to do that for line 9 to make a new class and then implement greeting interface
        //we could've just made an anonymous inner class.
        //See the image.
        //So it is somewhat a shortcut to overcome that, it is but both are different.
    }

    public void greet() {
        System.out.println("Hello World!");//This method is always printing hello world.
        //But what I want is want to do is that it should take input and do different thing based on the input.
        //One way is to do is we can contain all possible combinations for greet method that what can it do and then use a switch statement which is insufficient.
        //So what we want is the behaviour itself passed as an argument and the method does not really contain behaviour it just takes the behaviour and executes it.
        //One way to is before Java8 we can create an interface and pass that as a behaviour.
    }

    public void greet2(Greeting greeting) {
        greeting.perform();
    }


}
