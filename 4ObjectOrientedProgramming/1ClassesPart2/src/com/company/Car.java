package com.company;

//Public here is a access modifier i.e. it control the access we want to provide to other of this class.
//So, public means unrestricted access to a class.
//Usually we use public for classes , but there are others too such as private,protected or we can remove an access modifier too!
//******************************************************************************************************************************************************************************
//Unlike methods in which variables can-not accessed outside the method, class variables/member variables/fields can be accessed anywhere inside of that class.
//Method has local variables i.e. the are local to or belong to that method only.
//******************************************************************************************************************************************************************************
//When we are creating a field for a class we need to specify the access modifier just like how we did for the class.
//As a general rule we use private as an access modifier for a class's field unlike we did with for the class in that case we do public(in general).
//Now making a field as a private access modifier leads to encapsulation. Encapsulation means we are hiding the fields
// and methods (or anything for that matter like classes too) from getting accessed publicly.
//******************************************************************************************************************************************************************************
//Encapsulation (definition) = Encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code and the
// data it manipulates.Other way to think about encapsulation is, it is a protective shield that prevents the data from being accessed by the code outside this shield.
//******************************************************************************************************************************************************************************
//Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any
// member function of own class in which they are declared.
//******************************************************************************************************************************************************************************
//As in encapsulation, the data in a class is hidden from other classes using the data hiding concept which is achieved by making the
// members or methods of class as private and the class is exposed to the end user or the world without providing any details behind
// implementation using the abstraction concept, so it is also known as combination of data-hiding and abstraction..
//Encapsulation can be achieved by: Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.

//OBJECT IS NOTHING BUT AN INSTANCE OF A CLASS.
//Maneuver to main class to learn how object is created.
public class Car {
    private String model;//limited to this class
    private int doors;//limited to this class
    private int wheels;//limited to this class
    private String engine;//limited to this class
    private String color;//limited to this class

    //Now to resolve problem regarding encapsulation in Main class while defining audi.model = "Audi-A6" we make getters and setters
    //The getter method returns the value of the attribute. The setter method takes a parameter and assigns it to the attribute.
    //Getters :- get the field values.
    //Setters :- set the field values.

    public String getModel() {
        return model;
    }

    //By using these setters can add some validations :-
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        //.equal() method = Compares this string to the specified object. The result is true if and only if
        // the argument is not null and is a String object that represents the same sequence of characters as this object.
        if (validModel.equals("audi") || validModel.equals("honda")) {
            this.model = model;//this keyword specifies or tells us and intellij that this.model is the field and the other model is a parameter.
        } else {
            this.model = "Invalid model!";
        }
    }
//***************VERY IMPORTANT***********************
    //DIFFERENCE BETWEEN ABSTRACTION AND ENCAPSULATION.
    //ABSTRACTION IS ENCAPSULATION BUT WITH ADDING FUNCTIONALITY. ENCAPSULATION ONLY ENCAPSULATES OR HIDES THE VARIABLE AND METHODS TO
    //GET ACCESSED PUBLICALY .WHEREAS ABSTRACTION HIDES THE FUNCTIONALITY OF THE HIDDEN METHODS OR VARIABLES.
    //vid link :- https://www.youtube.com/watch?v=shNEPGoWmMY
}
