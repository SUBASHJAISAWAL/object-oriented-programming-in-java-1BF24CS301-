import java.util.Scanner;

class Account {
    String name;
    String accNo;
    String accType;
    double balance;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        name = sc.nextLine();
        System.out.print("Enter account number: ");
        accNo = sc.nextLine();
        System.out.print("Enter account type (saving/current): ");
        accType = sc.nextLine();
        System.out.print("Enter initial balance: ");
        balance = sc.nextDouble();
        sc.nextLine();
    }

    void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter deposit amount: ");
        double amt = sc.nextDouble();
        balance += amt;
        System.out.println("Deposited: " + amt + ". Updated balance: " + balance);
    }

    void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: ");
        double amt = sc.nextDouble();
        if (balance >= amt) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt + ". Updated balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void display() {
        System.out.println("Customer name: " + name);
        System.out.println("Account number: " + accNo);
        System.out.println("Account type: " + accType);
        System.out.println("Account balance: " + balance);
    }
}

class SavAcct extends Account {
    void computeInterest() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of years: ");
        int years = sc.nextInt();
        double interest = balance * 0.04 * years;
        balance += interest;
        System.out.println("Interest added: " + interest + ". Updated balance: " + balance);
    }
}

class CurAcct extends Account {
    void checkMinimum() {
        if (balance < 1000) {
            balance -= 100;
            System.out.println("Penalty of 100 imposed due to low balance.");
        } else {
            System.out.println("Minimum balance maintained.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account[] acc = new Account[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Compute Interest / Check Minimum");
            System.out.println("5. Display Account Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter account type (saving/current): ");
                    String type = sc.nextLine();

                    if (type.equalsIgnoreCase("saving")) {
                        acc[count] = new SavAcct();
                        acc[count].accType = "saving";
                    } else if (type.equalsIgnoreCase("current")) {
                        acc[count] = new CurAcct();
                        acc[count].accType = "current";
                    } else {
                        System.out.println("Invalid account type!");
                        break;
                    }

                    acc[count].inputDetails();
                    count++;
                    System.out.println("Account created successfully!");
                }

                case 2 -> {
                    System.out.print("Enter account number: ");
                    String accno = sc.nextLine();
                    int index = findAccount(acc, count, accno);
                    if (index != -1) acc[index].deposit();
                    else System.out.println("Account not found!");
                }

                case 3 -> {
                    System.out.print("Enter account number: ");
                    String accno = sc.nextLine();
                    int index = findAccount(acc, count, accno);
                    if (index != -1) acc[index].withdraw();
                    else System.out.println("Account not found!");
                }

                case 4 -> {
                    System.out.print("Enter account number: ");
                    String accno = sc.nextLine();
                    int index = findAccount(acc, count, accno);
                    if (index != -1) {
                        if (acc[index] instanceof SavAcct)
                            ((SavAcct) acc[index]).computeInterest();
                        else
                            ((CurAcct) acc[index]).checkMinimum();
                    } else System.out.println("Account not found!");
                }

                case 5 -> {
                    System.out.print("Enter account number: ");
                    String accno = sc.nextLine();
                    int index = findAccount(acc, count, accno);
                    if (index != -1) acc[index].display();
                    else System.out.println("Account not found!");
                }

                case 6 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }

    static int findAccount(Account[] acc, int count, String accno) {
        for (int i = 0; i < count; i++) {
            if (acc[i].accNo.equals(accno)) return i;
        }
        return -1;
    }
}
