package Chapter6.ComputerAssistedInstrution;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAIDifficultLevel {
    private static final SecureRandom generateDigit = new SecureRandom();

    private static int studentAnswer;
    private static int correctAnswer;
    private static int firstDigit;
    private static int secondDigit;

    public static int firstDigit(int userPut){
       if (userPut == 1){
           return firstDigit = 1 + generateDigit.nextInt(9);
       }else if(userPut == 2){
           return  1 + generateDigit.nextInt(99);
       }else {
           return firstDigit = 1 + generateDigit.nextInt(999);
       }

    }

    public static  int secondDigit (int userPut){
            if (userPut == 1){
                return secondDigit = 1 + generateDigit.nextInt(9);
            }else if(userPut == 2){
                return  1 + generateDigit.nextInt(99);
            }else {
                return secondDigit = 1 + generateDigit.nextInt(999);
            }

        }
    public static void  displayQuestion(){
        System.out.println("How much is " + firstDigit  + " times " + secondDigit + "?");
    }

    public static int basicMultiplication(){
        return correctAnswer = firstDigit * secondDigit;
    }
    public static int collectStudentAnswer(){
        Scanner input = new Scanner(System.in);
        return studentAnswer = input.nextInt();
    }

    public static void positiveComment(){
        int positiveComments = 1 +  generateDigit.nextInt(4);
        switch (positiveComments){
            case 1:
                System.out.println("very good!");
            case 2:
                System.out.println("Excellent!");
            case 3:
                System.out.println("Nice work!");
            case 4:
                System.out.println("Keep up the good work!");
            default:
                System.out.println();

        }

    }

    public static void negativeComments(){
        int negativeComments = 1 + generateDigit.nextInt(4);
        switch (negativeComments){
            case 1:
                System.out.println("No.please try again.");
            case 2:
                System.out.println("wrong.Try once more.");
            case 3:
                System.out.println("Dont give up.");
            case 4:
                System.out.println("No.keep trying.");
            default:{
                System.out.println();
            }
        }
    }


    public static void compareStudentAnswer(){
        if (studentAnswer == correctAnswer){
            positiveComment();
        }else {
            negativeComments();
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Enter
                1 for one-digit multiplication exercises
                2 for two-digit multiplication exercises
                3 for three-digit multiplication exercises
                """);
        int difficultyLevel = in.nextInt();
        int percentageAnswer = 0;

        if(difficultyLevel >= 1 && difficultyLevel <= 3) {
            for (int i = 1; i <= 10; i++) {
                firstDigit(difficultyLevel);
                secondDigit(difficultyLevel);
                displayQuestion();
                collectStudentAnswer();
                basicMultiplication();
                compareStudentAnswer();
                percentageAnswer += 10;
            }

            while (studentAnswer != correctAnswer) {
                collectStudentAnswer();
                compareStudentAnswer();
                percentageAnswer -= 10;
            }
            System.out.println(percentageAnswer);

            if (percentageAnswer < 75) {
                System.out.println("Please ask your teacher for extra help.");
            } else {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
        }
    }

}
