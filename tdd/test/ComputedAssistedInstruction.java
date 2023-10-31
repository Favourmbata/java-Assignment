package test;

import java.security.SecureRandom;

public class ComputedAssistedInstruction {
    private int correctAnwer;

    public static int generateRandomNumber() {
        SecureRandom random = new SecureRandom();
        int number = random.nextInt(1, 10);
        return number;
    }
}
//
//     public static String generateQuetions(){
//        int firstNumber = generateRandomNumber();
//        int secondeNumber = generateRandomNumber();
//        correctAnwer = firstNumber * secondeNumber;
//        String question = firstNumber + "multiply"+ secondeNumber;
//        return question;
//
//     }
//
//    public static boolean isAnwerCorrect(int number){
//        boolean isAnswerCorrect =  number == correctAnswer;
//        return  isAnswerCorrect;
//    }
//
//    public static String createDisplay(String message){
//        String horizontal = "=".repeat(50);
//        String display =
//        return null;
//    }
//}
