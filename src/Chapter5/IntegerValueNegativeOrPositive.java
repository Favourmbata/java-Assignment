package Chapter5;

public class IntegerValueNegativeOrPositive {

    public static void main(String[] args) {
        int value = 5;
        switch (value) {
            case 0:
                System.out.println("Zero");
                break;
            default:
                if (value < 0) {
                    System.out.println("Negative");
                }
                break;

        }
    }
}
