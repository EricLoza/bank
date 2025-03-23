import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double amount = 0; 
        Scanner scanner = new Scanner(System.in);
        Account account = new Account("user", 45, 12345, 100.0);

        System.out.println("Enter your account name: ");
        String loginName = scanner.nextLine();

        System.out.println("Enter your pin: ");
        int loginPin = scanner.nextInt();

        System.out.println("\033c");

        while(account.login(loginName, loginPin).booleanValue()) {
            int choice; 
            System.out.println("What would you like to do? ");
            System.out.print("1 = depost, 2 = withdraw, 3 = account info, -1 = quit: ");
            choice = scanner.nextInt(); 
            if (choice == -1) {
                System.out.println("Successful Logout");
                break; 
            } else {
                switch (choice) {
                    case 1:
                        System.out.println("\033c");
                        System.out.println("How much Would you like to deposit? ");
                        amount = scanner.nextDouble(); 
                        account.depost(amount);

                        break; 
                    case 2:
                        System.out.println("\033c");
                        System.out.println("How much Would you like to withdraw? ");
                        amount = scanner.nextDouble(); 
                        account.withdraw(amount);
                        break;
                    case 3:
                        System.out.println("\033c");
                        account.printInfo();
                        break;
                    default:
                        System.out.println("\033c");
                        System.out.println("Incorrect input!");
                        break;
                }
            }

        }

        scanner.close();
    }
}