package Jennifer;

import java.util.Scanner;

public class BiggerAndSmallest {
    public String calculateBiggerAndSmallest(){
        Scanner scanner = new Scanner(System.in);
        int [] myArr = new int[5];

        for (int i = 0; i < myArr.length; i++) {
            System.out.println("enter number " + (i+1));
            int numberEntered = scanner.nextInt();
            myArr[i] = numberEntered;
            }

        int newlargestNumber = myArr[0];
        int smallestNumber = myArr[0];
        for (int i = 0; i < myArr.length; i++){
             if(myArr[i] > newlargestNumber){
                 newlargestNumber = myArr[i];
            }
            if (myArr[i] < smallestNumber){
                smallestNumber = myArr[i];
            }
        }
        return "The largestNumber is -> "+ newlargestNumber + " The smallestNumber is " + smallestNumber;
    }

    public static void main(String[] args) {
        BiggerAndSmallest biggerAndSmallest = new BiggerAndSmallest();
        System.out.println(biggerAndSmallest.calculateBiggerAndSmallest());
    }
}
