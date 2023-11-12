package Class;

public class PascalTriangle {
    public static void printPascal(int number){
        for (int line = 1; line <= number; line++) {
            for (int next = 0; next <=number - line ; next++) {
                System.out.print(" ");
            }
         int value = 1;
            for (int i = 1; i <= line ; i++) {
                System.out.print(value + " ");
                value = value * (line -i)/ i;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number = 4;
        printPascal(number);
    }

}

