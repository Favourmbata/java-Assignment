package ClassTask;

public class MultiplicationWithoutOperator {

    public int multiplyWithoutOperator(int number1, int number2) {
        int result = 0;
        if (number2 > 0){
        for (int i = 1; i <=  number2; i++) {

            result = result + number1;
        }

        }else if (number2 < 0){
            for (int i = 1; i <=number1 ; i++) {
                result = result + number2;
            }

        }  if (number1 < 0 && number2 < 0) {
            for (int i = 1; i <= -number2 ; i++) {
                result = result + (-number1);
            }
        }

        return result;
    }
}

