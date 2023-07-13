package Chapter5.Practice;

public class ReverseNumber {

public static void reverseNumber(){
     int number = 123;
     int remainder,reverseNumber = 0;
     while (number > 0){
         remainder = number % 10;
         number = number /10;
         reverseNumber = (reverseNumber * 10)+ remainder;
     }
    System.out.printf("reverse number is %d ",reverseNumber);


}

    public static void main(String[] args) {
reverseNumber();
    }
}
