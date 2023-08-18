package Chapter4;

import java.util.Scanner;

public class FindTheLargestNumber {

    int salespersonCounter = 0;
    public  int largestNumber(){
        int max =0;
        Scanner scanner = new Scanner(System.in);
        while (salespersonCounter < 10){
            System.out.println("enter sales person unit");
             int unitSold = scanner.nextInt();
             if(unitSold > 0){
                 max = unitSold;
             }
             salespersonCounter++;
        }

    return max;
    }

    public static void main(String[] args) {
       FindTheLargestNumber findTheLargestNumber = new FindTheLargestNumber();
        System.out.println("the largest is "+findTheLargestNumber.largestNumber());
    }

}
