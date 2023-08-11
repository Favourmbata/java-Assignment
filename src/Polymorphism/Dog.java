package Polymorphism;

public class Dog extends Animal {
    private  int breed;

    public void eat(){
        System.out.println("chom chom");
    }

    public int getBreed() {
        return breed;
    }

    public void setBreed(int breed) {
        this.breed = breed;
    }
}
