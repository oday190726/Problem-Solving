import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int num = scanner.nextInt();

        // Check if the positive
        if (num <= 2) {
            System.out.println("No");
            return;
        }

        // Output "Yes" if divisible by 2, otherwise output "No"
        if (num % 2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
