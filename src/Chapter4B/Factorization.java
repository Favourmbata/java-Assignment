package Chapter4B;

public class Factorization {

    public int favouration(int number) {
        int total = 1;
        for (int i = number; i > 0 ; i--) {
          total = total * i;
        }
        return total;
    }


    public String factorialConstant(int constant) {

        double result = 0.0;
        for (int i = 0; i <= constant; i++) {
            result  += (double) 1 /favouration(i);

        }

    return String.format("%.3f", result);
     }


    public int exponentialOfFactorial(int exponential) {
     int sum = 1;
        for (int i = exponential - 1 ; i > 0 ; i--) {
            sum = 1 + exponential * sum / i;
        }
      return sum;
    }
}
