package Class;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public class CountSingleDigit {
    public static void main(String[] args) {


        ArrayList <Integer> savedOnes = new ArrayList<>();
        ArrayList <Integer> savedTwo = new ArrayList<>();
        ArrayList <Integer> savedThree = new ArrayList<>();
        ArrayList <Integer> savedFour = new ArrayList<>();
        ArrayList <Integer> savedFive = new ArrayList<>();
        ArrayList <Integer> savedSix = new ArrayList<>();
        ArrayList <Integer> savedSeven = new ArrayList<>();
        ArrayList <Integer> savedEight = new ArrayList<>();
        ArrayList <Integer> savedNine = new ArrayList<>();
        ArrayList <Integer> savedZero = new ArrayList<>();

        int [] myArr = new int[10];
        for (int i = 0; i < myArr.length; i++) {
                Random random = new Random();
            int goat =  random.nextInt(1,9);
            myArr[i] = goat;
            if (goat == 0) System.out.println(goat);
            if (goat == 1) System.out.println(goat);
            if (goat == 2) System.out.println(goat);
            if (goat == 3) System.out.println(goat);
            if (goat == 4) System.out.println(goat);
            if (goat == 5) System.out.println(goat);
            if (goat == 6) System.out.println(goat);
            if (goat == 7) System.out.println(goat);
            if (goat == 8) System.out.println(goat);
            if (goat == 9) System.out.println(goat);
            if (i % 10 == 0) System.out.println();
            System.out.print(myArr[i] +" ");
        }

        System.out.println();
    }
}
