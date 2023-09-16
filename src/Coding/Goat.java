package Coding;

public class Goat {

    public static String returnStringExample(){
        return String.format("i love to eat Spag");
    }

    public static void main(String[] args) {
        String receiver = returnStringExample();

        System.out.println(receiver);
    }

}
