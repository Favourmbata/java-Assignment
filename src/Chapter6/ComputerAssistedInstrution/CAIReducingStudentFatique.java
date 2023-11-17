package Chapter6.ComputerAssistedInstrution;

import java.security.SecureRandom;
import java.util.Scanner;
//(Computer-Assisted Instruction: Reducing Student Fatigue) One problem in CAI environ-
//        ments is student fatigue. This can be reduced by varying the computer’s responses to hold the stu-
//        dent’s attention. Modify the program of Exercise 6.35 so that various comments are displayed for
//        each answer as follows:
//        Possible responses to a correct answer:
//        Very good!
//        Excellent!
//        Nice work!
//        Keep up the good work!
//        Possible responses to an incorrect answer:
//        No. Please try again.
//        Wrong. Try once more.
//        Don't give up!
//        No. Keep trying.
//        Use random-number generation to choose a number from 1 to 4 that will be used to select
//        one of the four appropriate responses to each correct or incorrect answer. Use a switch statement to
//        issue the responses.
//
public class CAIReducingStudentFatique {
    private static final SecureRandom generateDigit = new SecureRandom();

    private static int studentAnswer;
    private static int correctAnswer;
    private static int firstDigit;
    private static int secondDigit;

    public static int firstDigit(){

        return firstDigit = 1 + generateDigit.nextInt(9);
    }

    public static  int secondDigit (){
        return secondDigit = 1 + generateDigit.nextInt(9);

    }
    public static void  displayQuestion(){
        System.out.println("How much is " + firstDigit  + " times " + secondDigit + "?");
    }

    public static int basicMultiplication(){
        return correctAnswer = firstDigit * secondDigit;
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

    public static int collectStudentAnswer(){
        Scanner input = new Scanner(System.in);
        return studentAnswer = input.nextInt();
    }
    public static void compareStudentAnswer(){
        if (studentAnswer == correctAnswer){
           positiveComment();
        }else {
            negativeComments();
        }

    }
    public static void main(String[] args) {
        firstDigit();
        secondDigit();
        displayQuestion();
        collectStudentAnswer();
        basicMultiplication();
        compareStudentAnswer();

        while (studentAnswer == correctAnswer){
            firstDigit();
            secondDigit();
            displayQuestion();
            collectStudentAnswer();
            basicMultiplication();
            compareStudentAnswer();
        }
        while (studentAnswer != correctAnswer){
            collectStudentAnswer();
            compareStudentAnswer();
        }
    }

}



