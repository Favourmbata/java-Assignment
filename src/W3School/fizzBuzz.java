package W3School;

public class fizzBuzz {
    public static void main(String[] args) {
        for (int number = 0; number <= 50 ; number++) {
            if (number % 3 == 0 && number % 5 == 0){
                System.out.println("Fizz Buzz");
            }else if (number % 3 == 0){
                System.out.println("Fizz");
            }else {
                System.out.println("Buzz");
            }
        }
    }
}
