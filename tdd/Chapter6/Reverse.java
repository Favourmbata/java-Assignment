package Chapter6;

public class Reverse {
    public int reverseInteger(int number) {
        int reverse =  0;
        while (number != 0){

            reverse = reverse * 10 + number % 10;
            number = number /= 10;
        }


        return reverse;
    }
}
