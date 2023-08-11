package Polymorphism;

public class Polymorphism {

    public static void main(String[] args) {


        Animal myAnimal = new Animal();

        myAnimal.eat();

        Dog dog = new Dog();
        dog.eat();

        Cat cat = new Cat();
        cat.eat();

    }


}
