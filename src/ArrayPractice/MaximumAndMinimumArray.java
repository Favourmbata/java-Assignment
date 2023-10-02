package ArrayPractice;

public class MaximumAndMinimumArray {

    public static String maximummAndMinimum(int[] array){

        int max = array[0];
        for (int i = 0; i <array.length ; i++) {
            if (max<array[i]){
                max = array[i];
            }
        }



        int min = array[0];
        for (int i = 1; i <array.length ; i++) {
            if (min > array[i]){
                min= array[i];
            }
        }
     return    "minimum number in array : " + min +"\n"+"maximum number in array : " + max;

    }

    public static void main(String[] args) {
        int [] array = {2,30,40,70,80,90,120};
        System.out.println(maximummAndMinimum(array));
    }

}
