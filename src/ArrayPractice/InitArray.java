package ArrayPractice;

public class InitArray {

    public static void main(String[] args) {

        final int Array_LENGTH = 10;
        int[] array = new int[Array_LENGTH];
        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = 2 + 2 * counter;
        }
        System.out.printf("%s%8s%n", "Index", "value");

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}
