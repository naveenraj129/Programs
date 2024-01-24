

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        long num = scanner.nextLong();

        int count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);

        scanner.close();
    }
}

