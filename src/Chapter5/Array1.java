package Chapter5;

public class Array1 {
    public static void main(String[] args) {

    int [] myIntArray = new int[10];
        for (int i = 0; i < myIntArray.length  ; i++) {
          myIntArray[i] = 10;
        }
        for (int i = 0; i < myIntArray.length ; i++) {
            System.out.println("Element" + i+ ",value is " + myIntArray[i]);
        }
    }


}
