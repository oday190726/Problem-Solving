import java.util.Scanner;

public class SearchMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows and columns:");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the element to search:");
        int se = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == se) {
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (found) {
            System.out.println("Exists");
        } else {
            System.out.println("Does not exist");
        }
    }
}
