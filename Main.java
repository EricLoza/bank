import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account("", 0, 0.0);

        System.out.println("Enter your name: ");
        account.name = scanner.nextLine();

        System.out.println("Enter your age: ");
        account.age = scanner.nextInt();

        System.out.println("Enter your balance:");
        account.balance = scanner.nextDouble();
        scanner.close();
    }
}