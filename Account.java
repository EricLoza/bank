public class Account {
    
    String name;
    double balance; 
    final int pin, age;

    Account(String name, final int age, final int pin, double balance) {
        this.name = name;
        this.age = age;
        this.pin = pin; 
        this.balance = balance;
    }

    public Boolean login(String loginName, int loginPin) {
        if(loginName.equals(name) && loginPin == pin) {

        } else {
            System.out.println("Incorrect credentials!");
            return false; 
        }
        return true; 

    }

    public void depost(double amount) {
        balance += amount; 
        System.out.printf("$%.2f successfully added.", amount);
        System.out.println();
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount; 
            System.out.printf("$-%.2f successfully withdrawn.", amount);
        } else {
            System.out.print("Inusfficient Funds D:");
        }
        
        System.out.println();
    }

    public void printInfo() {
        System.out.println("-----Account Information-----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}
