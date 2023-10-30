package Class;

import java.security.SecureRandom;

public class Secuure {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        System.out.println(random.nextInt(1,10));

    }
}
