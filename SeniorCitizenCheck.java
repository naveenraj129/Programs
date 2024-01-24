
import java.util.Scanner;

public class SeniorCitizenCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if (age >= 60) {
            System.out.println("Senior Citizen");
        } else {
            System.out.println("Not a Senior Citizen");
        }

        scanner.close();
    }
}
