package Chapter5;

import java.util.Scanner;

public class CollectValidScore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int validSum = 0;
        for( int counter = 1; counter < 11; counter++){
            System.out.println("enter score");
            int score = scanner.nextInt();
            if ( score > 0 && score < 100 ){

            }
            else{
                System.out.println("invalid number\n");
                continue;
            }
            validSum = validSum + score;


        }

        System.out.print("The valid sum is " +validSum);

    }

}

