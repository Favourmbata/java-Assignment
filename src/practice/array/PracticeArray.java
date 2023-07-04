package practice.array;

public class PracticeArray {
    public static void main(String[] args) {


        int[] initializeArray = {5, 3, 7, 8, 9, 6};
        int[] normalArray = new int[19];

        normalArray[2] =90;
        normalArray[6] = 400000;
        normalArray[5] = 1000;
//        normalArray[0] = 4;
//        normalArray[1] = 400;
        for (int i = 0; i < normalArray.length; i++) {
            System.out.print(normalArray[i]+" ");
//            System.out.println();
//            System.out.print(i+" ");
        }

    }
}