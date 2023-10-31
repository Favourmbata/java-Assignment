package DanielLiang.Chapter1;

public class GreatestCommonDivisor {
    public static int gcd(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        if (a == b) return b;
        if (a > b) return gcd(a - b, b);
        return gcd(a, b - a);

    }

    public static void main(String[] args) {
        int a = 105;
        int b = 252;
        System.out.println("the gcd of " + a + " and " + b + " is " + " = " + gcd(a, b));
    }
}
