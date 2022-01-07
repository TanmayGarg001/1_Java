package com.company;

//Note that there is no access modifier here if you add you'll get an error and need to make new java file for that.
//This can be used in situations where classes are very short and not complicated.
//You may only have one public class per file, and it may only be named after the file, in this case Main.java.

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "Shark madness!";
    }
}

class Interstellar extends Movie {
    public Interstellar() {
        super("Interstellar");
    }

    @Override
    public String plot() {
        return "Space Adventure!";
    }
}

class Predestination extends Movie {
    public Predestination() {
        super("Predestination");
    }

    @Override
    public String plot() {
        return "Time travel!";
    }
}

class GameNight extends Movie {
    public GameNight() {
        super("GameNight");
    }

    @Override
    public String plot() {
        return "Funny movie";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable Movie");
    }

}

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + movie.plot());
            System.out.println("------------------------------------");
        }
        //movie.plot() is here example of polymorphism, it is calling plot() functions which has various forms and gives preference to the Overridden method in the class.
        //For an easy example consider next part of polymorphism project

    }

    public static Movie randomMovie() {
        int randomInt = (int) (Math.random() * 5) + 1;//generates random integer between 1 to 5 included.
        System.out.println("Random number generated was : " + randomInt);
        switch (randomInt) {
            case 1:
                return new Jaws();
            case 2:
                return new Interstellar();
            case 3:
                return new Predestination();
            case 4:
                return new GameNight();
            case 5:
                return new Forgettable();
            default:
                return null;
        }

    }

}
