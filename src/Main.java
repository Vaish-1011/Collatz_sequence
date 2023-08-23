import java.util.Scanner;
public class Main {
    public static void printCollatzSequence(int n) {
        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printCollatzSequence(n);
        scanner.close();
    }
}
