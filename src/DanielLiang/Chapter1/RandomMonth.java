package DanielLiang.Chapter1;

import java.util.Random;

public class RandomMonth {
    public static void main(String[] args) {
        Random random = new Random();

//    int month = random.nextInt(12)+1;
//      String nameOfMonth = getNameInEnglish(month);
//        System.out.println("The random month is->"+nameOfMonth);
//    }
//
//    private static String getNameInEnglish(int month) {
//    String []nameOfMonths = {"jan","feb","march","april","may","june","july","aug","sep","oct","nov","dec"};
//   return nameOfMonths[month -1];


        // Initialize an array of month names
        String[] monthNames = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };


//        String monthName = monthNames[randomNumber - 1]; // Subtract 1 to account for array indexing
//        System.out.println("Randomly generated month: " + monthName);


    }
}