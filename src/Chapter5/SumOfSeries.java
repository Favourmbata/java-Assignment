package Chapter5;

public class SumOfSeries {

    public static void main(String[] args) {

        long sum;

        System.out.println("n\tSum");
        System.out.println("----------");

        for (int n = 1; n <= 100; n++) {
            sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println(n + "\t" + sum);
        }
    }
}









