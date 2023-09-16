package Chibuzor;

public class PrintTableRaiseToPower {
//    public static void raisingToPower() {
//        System.out.println("a");
//        for (int number = 1; number <= 5; number++) {
//            System.out.println(number);
//
//
//        }
//        System.out.println();
//
//        System.out.println("b");
//        for (int sort = 2; sort <= 6; sort++) {
//            System.out.println(sort);
//
//        }
//        System.out.println("pow(a,b)");
//        for (int number = 1; number <= 5 ; number++) {
//            for (int sort = 2; sort <= 6; sort++) {
//                int result =(int) Math.pow(number,sort);
//                System.out.println(result);
//            }
//
//        }
//        System.out.println();

//    }

    public static void main(String[] args) {
        raisingToPower();
    }

    private static void raisingToPower() {
        System.out.println("a \t b \t pow(a, b)");
        for (int i = 1; i < 6; i++) {
            System.out.printf("%d \t %d \t %.0f \n", i, i+1, Math.pow(i, i+1) );
        }
    }
}