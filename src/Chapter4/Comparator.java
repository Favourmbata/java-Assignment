package Chapter4;

import java.util.Scanner;

public class Comparator {

    public void print(String word){
        System.out.println(word);

    }

     public void print(int word){
         System.out.println(word);
     }
    public int compare(){
        Scanner scanner = new Scanner(System.in);
            print("enter first number");
        int number1 = scanner.nextInt();
        print("enter second number");
        int number2 = scanner.nextInt();

        if (number1 == number2)return 0;
        else if (number1 > number2)return 1;
        else if (number2 > number1)return -1; {

        }
        {

        }
      return compare();

    }

    public static void main(String[] args) {
        Comparator comparator = new Comparator();
        System.out.println( comparator.compare());
    }

}
