public class Account {
    
    String name;
    double balance, amount; 
    int age; 
    Account(String name, int age, double balance) {
        this.name = name;
        this.balance = balance;
        this.age = age; 
    }

    public void add() {

    }

    public void withdraw() {

    }

    public void printInfo() {

        System.out.println("Name" + name);
        System.out.println("Age" + age);
        System.out.println("Balance" + balance);
    }
}
