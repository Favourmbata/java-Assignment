package Chapter6;

import java.security.SecureRandom;

public class RamdomInteger {

public static void ramdomInteger() {

    SecureRandom randomNumbers = new SecureRandom();
    for (int count = 1; count <= 20; count++) {
        int face = 1 + randomNumbers.nextInt(6);
        System.out.printf("%d  ", face);

        if (count % 5 == 0) {
            System.out.println();
        }
    }
}
    public static void main(String[] args) {
ramdomInteger();
    }
}
