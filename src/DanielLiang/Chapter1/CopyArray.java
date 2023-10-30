package DanielLiang.Chapter1;

public class CopyArray {
    public static void main(String[] args) {
        int[]myList = {1,2,3,5,6};
        int[]copy = new int[myList.length];
        for (int i = 0; i < myList.length ; i++) {
             copy[i] = myList[i];

            System.out.print(copy[i] +" ");

        }



    }

}
