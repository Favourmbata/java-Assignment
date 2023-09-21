package Coding;

public class MultiplicationTable {
    public static void main(String[] args) {

        System.out.println("Multiplication Table 1 to 12");
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j < 13 ; j++) {
                System.out.printf("%4d",i * j);
            }
                System.out.println();
        }



    }
}
