package W3School;

public class SwapTwoVariables {
    public static void main(String[] args) {
//        int number = 1;
//        int number1 = 2;
//        int number2 = 1;
//
//        System.out.println( " "+ number1 +" "  +number2);

//        int a, b;
//        a = 15;
//        b = 27;
//        System.out.println("Before swapping : a, b = "+a+", "+ + b);
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println("After swapping : a, b = "+a+", "+ + b);

        int a, b, temp;
        a = 15;
        b = 27;
        System.out.println("Before swapping : a, b = "+a+", "+ + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = "+a+", "+ + b);




    }
}
