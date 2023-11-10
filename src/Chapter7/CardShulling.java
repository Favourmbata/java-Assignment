package Chapter7;
import java.util.Random;
public class CardShulling {
    public static void main(String[] args) {
        // Create an object of the Random class to generate random numbers
        Random random = new Random();

        // Initialize an array to store the count of each possible sum
        int[] sumOccurrences = new int[13]; // Indices 2 through 12 will be used

        // Simulate rolling the dice 36,000,000 times
        for (int i = 0; i < 36000000; i++) {
            // Roll the first die (values from 1 to 6)
            int die1 = random.nextInt(6) + 1;

            // Roll the second die (values from 1 to 6)
            int die2 = random.nextInt(6) + 1;

            // Calculate the sum of the two dice values
            int sum = die1 + die2;

            // Increment the count for the corresponding sum in the array
            sumOccurrences[sum]++;
        }

        // Display the results in tabular format
        System.out.printf("%-10s%-10s%n", "Sum", "Occurrences");
        System.out.println("-------------------");

        for (int i = 2; i <= 12; i++) {
            System.out.printf("%-10d%-10d%n", i, sumOccurrences[i]);
        }
    }
}
