package OOPpackage.pizzaRecommendingApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner can = new Scanner(System.in);

        PizzaRecommendingApp pizzaRecommendingApp = new PizzaRecommendingApp();
        System.out.println("""
                press 1  for classic people 
                press 2 for super hungry people
                press 3 for hungry people 
                                
                """);

        int people = can.nextInt();


        if (people == 1) {


            System.out.println("""
                    how many of classic people
                    """);
            people = can.nextInt();
            System.out.println(pizzaRecommendingApp.classicPeopleBoxCalculator(people));
        }
    }

}



