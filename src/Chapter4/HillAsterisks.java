package Chapter4;

public class HillAsterisks {

    public static void main(String[] args) {

        int hill = 5;
        for (int i = 1; i <= hill ; i++) {
            for (int j = i; j < hill ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int j = 1; j < i ; j++) {
                System.out.print(" * ");
            }
             System.out.println();
        }
   
   
   
    }


}
