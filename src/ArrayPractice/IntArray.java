package ArrayPractice;

public class IntArray {

    public static void main(String[] args) {

    int [] array = {32,27,18,64,45,90,37,60,14,95};
        System.out.printf("%s%8%s%n","Index","value");
        for (int counter = 0; counter < array.length ; counter++) {
            System.out.printf("%5d%8d%n" ,counter,array[counter]);
        }

    }

}
