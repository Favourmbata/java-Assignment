package Chapter5;

import java.util.Scanner;

public class MinimumAndMaximumEtreme {
    static Scanner scanner = new Scanner(System.in);

    public static void minimumAndMaximum() {

        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        System.out.println("How many values do you want to input: ");
        String inputNumber = scanner.next();
        for (int input = 1; input <= inputNumber.length() ; input++) {
            if (Character.isAlphabetic(inputNumber.charAt(input))) {
                System.out.println("you have entered an alphabet");
            }
        }

        int numberOfTime = Integer.parseInt(inputNumber);

            boolean control = false;
            for (int i = 1; i <= numberOfTime; i++) {

                System.out.println("enter number..... " + i);
                String utilityNumber = scanner.next();


                for (int j = 0; j < utilityNumber.length(); j++) {
                    if (Character.isAlphabetic(utilityNumber.charAt(i))) {
                        System.out.println("you have enter an alphabet");
                        control = true;
                    }
                    if (control) continue;

                }
                int collectedNumber = Integer.parseInt(utilityNumber);
            }
            if (numberOfTime > maximum) {
                maximum = numberOfTime;
            }
            if (numberOfTime < minimum) {
                minimum = numberOfTime;
            }
            // System.out.println("Enter the sum of minimum and "  +minimum);
            System.out.println("The maximum of value is " + maximum);
            System.out.println("sum of the two extremes is ");

        }


    public static void main(String[] args) {


        }


    }
