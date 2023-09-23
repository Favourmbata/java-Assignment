package Coding;

public class LargestAndSmallest {
    public int validatingTheLargest(int number1, int number2, int number3) {
       int largest = 0;
       boolean isNegative = largest < 0;
        if (number1 > number2 && number1 > number3){
            largest = number1;
        }else if (number2 > number1 && number2 > number3){
            largest = number2;
        }else if (number3 > number1 && number3 > number2){
            largest = number3;
        }else if (number1 == number2 && number1 == number3){
            largest = number1;
        }else if (number2 == number1 && number2 == number3){
            largest = number2;
        }else if (number3 == number1 && number3 == number1){
            largest = number3;
        }else {
            return 0;
        }


      return largest;
    }
}
