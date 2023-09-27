package Chapter6;

public class Multiples {

        public boolean isMultiple ( int number1, int number2){
            if (number2 % number1 == 0) {
                return true;
            }
            return false;
        }

    public static void main(String[] args) {
        Multiples multiples = new Multiples();
        multiples.isMultiple(6,3);
    }

}


