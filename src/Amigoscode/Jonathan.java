package Amigoscode;

public class Jonathan {
    public static void main(String[] args) {

        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;
        int number = firstNumber;
        firstNumber = secondNumber;
        secondNumber = thirdNumber;
        thirdNumber = number;
        System.out.println("The result of number is " + firstNumber +" " + secondNumber + " "  +thirdNumber);
    }
}
