package arrayPackage;

public class ArrayIndex {
    public static void main(String[] args) {
     int []numbers = {7,9,4,2,77,80,};
     int index = 0;
        for (int count = 0; count < numbers.length ; count++) {
            if (numbers[count] == 80){
                index  = count;
            }
        }
        System.out.println("The index is:" + index);
    }
}
