import java.util.Scanner;

public class Factorial {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int num=scanner.nextInt();



        // Output "Yes" if the factorial is even, otherwise output "No"
        if (num == 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }


}
