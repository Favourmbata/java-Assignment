package ArrayPractice;

public class IndexNumber {

    public static void indexNumber() {

        int[] numbers = {5, 10, 33, 9, 90, 23, 17, 30};
        int index= 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 23){
                index = i;
            }
        }
        System.out.println("index = " + index);
    }

    public static void main(String[] args) {
indexNumber();
    }
}
