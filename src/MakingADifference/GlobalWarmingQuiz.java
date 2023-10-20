package MakingADifference;

import java.util.Scanner;

public class GlobalWarmingQuiz {

    public int getQuestionsAndAnswers(int responses ){
        Scanner console = new Scanner(System.in);

        System.out.println("Global warming Qiz");


        int correctAnswer = 0;

        System.out.println("Question1:Which of the following is not an effect of global warming?");
        System.out.println("""
                1:Rising sea level
                2:Heat waves
                3:Expansion of desert
                4:Inadequate supply of water
                """);
             int answer1 = console.nextInt();
             if (answer1 == 4){
                 correctAnswer++;
             }


        System.out.println("Question2:What percentage of carbondioxide that goes into the air is absorbed by the ocean? :");
        System.out.println("""
                1:40%
                2: 35%
                3: 70%
                4: 50%
                """);
         int answer2 = console.nextInt();
         if (answer2 == 4){
             correctAnswer++;
         }
        System.out.println("Question3:What is Global Warming?:");
        System.out.println("""
                1:The earth is getting Warmer.
                2:The earth is getting cooler.
                3:The earth's temperature is just right.
                """);
             int answer3 = console.nextInt();
             if (answer3 == 1){
                 correctAnswer++;
             }

        System.out.println("Question4:What does global mean->");
        System.out.println("""
                1:How much people there are
                2:World wide
                3:Very cold
                4:Dance
                
                """);
        int answer4 = console.nextInt();
        if (answer4 == 2){
            correctAnswer++;
        }

        System.out.println("Question5:Which of is not a negative effect of global warming:");
        System.out.println("""
                1:Larger fish population
                2:few infection  diseases
                3:Species extinction
                4:Loss of coastal areas
                """);
             int answer5 = console.nextInt();
             if (answer5 == 1){
                 correctAnswer++;
             }


        System.out.println("Question6:Recycling just one plastic bottle can save the amount of energy needed to power a 60 watt light bulb for?");
        System.out.println("""
                1:10 minutes
                2:1 hour
                3:6 hours
                
                """);
         int answer6 = console.nextInt();
         if (answer6 == 3){
             correctAnswer++;
         }
        System.out.println("\nQuiz Results:");
        System.out.println("You got " + correctAnswer+ " Out of six questions correct:");


         if (correctAnswer == 6){
             System.out.println("Excellent");
         }else if (correctAnswer == 4){
             System.out.println("Very good");
         }else {
             System.out.println("Time to brush up on your global warming Knowledge:");
         }






         return correctAnswer;
    }


    public static void main(String[] args) {
        GlobalWarmingQuiz globalWarmingQuiz = new GlobalWarmingQuiz();
        globalWarmingQuiz.getQuestionsAndAnswers(6);
    }


}
