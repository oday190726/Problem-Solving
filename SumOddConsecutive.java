import java.util.Scanner;

public class SumOddConsecutive {

    // Main driver method
    public static void main(String[] args) {

        // Create scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Read number of input sets
        int numSets = scanner.nextInt();

        // Validate input
        if(numSets <= 0) {
            System.out.println("Invalid input");
            return;
        }

        // Process each input set
        for(int i = 0; i < numSets; i++) {

            // Read start and end range
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            // Validate inputs
            if(start < 0 || end < 0) {
                continue;
            }

            // Get min and max
            int min = Math.min(start, end);
            int max = Math.max(start, end);

            // Calculate sum of odds in range
            int sum = getSumOfOddNumbersInRange(min, max);

            // Print out sum
            System.out.println(sum);

        }

        // Close scanner
        scanner.close();

    }

    // Separate method to calculate required sum
    public static int getSumOfOddNumbersInRange(int min, int max) {

        int sum = 0;

        // Loop through numbers and add odds
        for(int j = min + 1; j < max; j++) {
            if(j % 2 != 0) {
                sum += j;
            }
        }

        return sum;

    }

}