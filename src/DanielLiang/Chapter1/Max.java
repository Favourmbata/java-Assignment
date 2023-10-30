package DanielLiang.Chapter1;

public class Max {
    public static void main(String[] args) {
        int []myList = {1,5,3,4,5,5};
        double max = myList[0];
        int index = 0;
        for (int i = 1; i < myList.length ; i++) {
            if (myList[i] > max){
                max = myList[i];
                index = i;
            }

        }
        System.out.println(max);
    }
}
