package MakingADifference;

import java.util.Scanner;
public class TheFairTax {


    public boolean verifyCategory(String [] categories, String category){

        for (int i = 0; i < categories.length; i++) {
            if (categories[i].equalsIgnoreCase(category)) return true;
        }
        return false;
    }

    public double calculatingFairTax( double totalExpenses) {

        double fairRate = 0.30;
        double fairTax = 0.0;
         fairTax = totalExpenses * fairRate/100;

        return  fairTax;
    }

    public static void main(String[] args) {
        TheFairTax fairTax = new TheFairTax();
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        String category = "";
        double amount = 0.0;
        double total = 0.0;
        String[] listOfCategories = {"housing", "food", "clothing", "transportation", "education", "health care", "vacation"};

        while (true) {

            System.out.println("what did you buy ");
            String product = input.next();
            while (true) {
                System.out.println("""
                        what category
                        housing, food, clothing, transportation, education, health care, vacation
                                        
                        """);
                category = input.next();
                if (fairTax.verifyCategory(listOfCategories, category)) break;


                System.out.println("\n\n   pleas enter a valid category");

            }

            System.out.println("how much is it ");
            amount = input1.nextDouble();
           total  += amount;

            System.out.println("\n did you buy something else?  \n enter N for no enter anything for yes ");
            if (input.next().equalsIgnoreCase("N")) break;
            }

        String emo = "\uD83E\uDD29\uD83E\uDD29\uD83E\uDD29\uD83E\uDD29";

        System.out.println(emo+" this is the total:  "+fairTax.calculatingFairTax(total)+"  category: "+category);



    }
}