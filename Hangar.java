package main.java;

public class Hangar {

    public static void main(String[] args) {

        // donald receives a reference to a new instance of class Duck
        Car clio = new Car("Clio");
        Boat titanic = new Boat("Titanic");
        // getters usage
        System.out.println(clio.doStuff());
        System.out.println(titanic.doStuff());
    }
}
