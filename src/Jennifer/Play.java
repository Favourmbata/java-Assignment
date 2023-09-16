package Jennifer;

public class Play {
    public static void main(String[] args) {
        printBox(5);
    }

    private static void printBox(int numberOfStars) {
        for (int i = 0; i < numberOfStars ; i++) {
            printStars(numberOfStars);
        }
    }

    private static void printStars(int numberOfStars) {
        for (int i = 1; i <=numberOfStars ; i++) {
            System.out.print("* ");
        }
        System.out.println();

    }

    private static void printpacedStar(int numberOfstars) {
            System.out.println("*        *");
        }

}



