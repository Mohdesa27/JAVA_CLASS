import java.util.*;

public class Banking_System {
    static class Account {
        String name;
        String phone;
        String email;
        String address;
        double balance;

        // Constructor
        Account(String name, String phone, String email, String address, double balance) {
            this.name = name;
            this.phone = phone;
            this.email = email;
            this.address = address;
            this.balance = balance;
        }

        // Display account details
        void showDetails() {
            System.out.println("Name: " + name);
            System.out.println("Phone: " + phone);
            System.out.println("Email: " + email);
            System.out.println("Address: " + address);
            System.out.println("Balance: " + balance);
        }

        // Deposit money
        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Updated Balance: " + balance);
        }

        // Withdraw money
        void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
                System.out.println("Updated Balance: " + balance);
            } else {
                System.out.println("Insufficient balance");
            }
        }

        // Show balance
        void showBalance() {
            System.out.println("Current Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ResourceBundle rb = null;
        Locale locale = null;

        // Ask the user for language choice
        System.out.println("Choose a language / Ek bhasha chunein:");
        System.out.println("1: English");
        System.out.println("2: Hindi");

        int choice = sc.nextInt();
        sc.nextLine();  // Consume newline

        // Set locale based on user choice
        if (choice == 1) {
            locale = new Locale("en", "US");
        } else if (choice == 2) {
            locale = new Locale("hi", "IN");
        } else {
            System.out.println("Invalid choice, defaulting to English.");
            locale = new Locale("en", "US");
        }

        rb = ResourceBundle.getBundle("MessagesBundle", locale);

        // Collect account details
        System.out.println(rb.getString("enter_name"));
        String name = sc.nextLine();
        
        System.out.println(rb.getString("enter_phone"));
        String phone = sc.nextLine();
        
        System.out.println(rb.getString("enter_email"));
        String email = sc.nextLine();
        
        System.out.println(rb.getString("enter_address"));
        String address = sc.nextLine();
        
        System.out.println(rb.getString("enter_initial_balance"));
        double balance = sc.nextDouble();
        
        Account account = new Account(name, phone, email, address, balance);
        sc.nextLine(); // Consume newline

        while (true) {
            // Show menu options
            System.out.println(rb.getString("menu"));
            int action = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            if (action == 1) {
                // Show account details
                account.showDetails();
            } else if (action == 2) {
                // Deposit money
                System.out.println(rb.getString("enter_deposit_amount"));
                double depositAmount = sc.nextDouble();
                account.deposit(depositAmount);
            } else if (action == 3) {
                // Withdraw money
                System.out.println(rb.getString("enter_withdraw_amount"));
                double withdrawAmount = sc.nextDouble();
                account.withdraw(withdrawAmount);
            } else if (action == 4) {
                // Show balance
                account.showBalance();
            } else if (action == 5) {
                // Exit
                System.out.println(rb.getString("goodbye"));
                break;
            } else {
                System.out.println(rb.getString("invalid_choice"));
            }
        }
    }
}
