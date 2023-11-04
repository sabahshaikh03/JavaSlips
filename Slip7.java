/*
 Design a class for Bank. Bank Class should support following operations;
 a. Deposit a certain amount into an account
 b. Withdraw a certain amount from an account
 c. Return a Balance value specifying the amount with details
*/

public class Slip7 {
    public String name;
    private Double balance;

    Slip7(String name) {
        this.name = name;
        this.balance = 0d;
    }

    Slip7(String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    private void Withdraw(Double amount) {
        this.balance -= amount;
    }

    private void details() {
        System.out.println("Name : " + this.name);
        System.out.println("Balance : " + this.balance);
    }

    public static void main(String[] args) {
        Slip7 abc = new Slip7("Pinkyy", 22890.8);

        abc.details();

        abc.deposit(10000.0);

        abc.details();

        abc.Withdraw(890.8);

        abc.details();

    }
}
