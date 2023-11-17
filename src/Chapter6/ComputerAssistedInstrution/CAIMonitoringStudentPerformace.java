package Chapter6.ComputerAssistedInstrution;


//  (Computer-Assisted Instruction: Monitoring Student Performance) More sophisticated
//         computer-assisted instruction systems monitor the student’s performance over a period of time. The
//         decision to begin a new topic is often based on the student’s success with previous topics. Modify
//         the program of Exercise 6.36 to count the number of correct and incorrect responses typed by the
//         student. After the student types 10 answers, your program should calculate the percentage that are
//         correct. If the percentage is lower than 75%, display "Please ask your teacher for extra help.",
//         then reset the program so another student can try it. If the percentage is 75% or higher, display
//         "Congratulations, you are ready to go to the next level!", then reset the program so another
//         student can try it.


import java.security.SecureRandom;
import java.util.Scanner;

public class CAIMonitoringStudentPerformace {
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
        int percentageAnswer = 0;
        for (int i = 0; i < 10 ; i++) {
            firstDigit();
            secondDigit();
            displayQuestion();
            collectStudentAnswer();
            basicMultiplication();
            compareStudentAnswer();
           percentageAnswer += 10;
        }

        while (studentAnswer != correctAnswer){
            collectStudentAnswer();
            compareStudentAnswer();
            percentageAnswer -=10;
        }
        System.out.println(percentageAnswer);
      if (percentageAnswer < 75){
          System.out.println("please ask your teacher for extra help:");
      }else {
          System.out.println("congratulatulation,you are ready to go the next level:");
      }
    }


}
