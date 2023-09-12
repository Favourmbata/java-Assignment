package Chapter4;



    import java.util.Scanner;


public class Encryption{

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.println("Please enter four digit number");
            int number = input.nextInt();

           int digit1 =  number/1000;
           int digit2 = number /100%10;
           int digit3 = number /10%10;
            int digit4  = number % 10;


           digit1 = digit1 -7;
           digit2 = digit2-7;
           digit3 =digit3 -7;
           digit4 = digit4-7;

           int decrypt = digit1;
           digit1 = digit3;
           digit3 = decrypt;

           decrypt = digit2;
           digit2 = digit4;
           digit4 = decrypt;

            System.out.println("Your encrypted code is " + digit1 + " " +digit2 + " "+ digit3 + " " + digit4);

        }
    }

