/*
 * Design a Super class Customer (name, phone-number). Derive a class Depositor(accno , balance)
 * from Customer. Again, derive a class Borrower (loan-no, loan-amt) from Depositor. Write
 * necessary member functions to read and display the details of ‘n’customers.
 */

class Customer {
    public String name;
    protected String phoneNo;

    Customer(String name, String phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public void showDetails() {
        System.out.println("Customer name : " + this.name);
        System.out.println("Customer phoneNo : " + this.phoneNo);
    }
}

class Depositor extends Customer {
    protected int accno;
    protected double balance = 0;

    Depositor(String name, String phoneNo, int accno, double balance) {
        super(name, phoneNo);
        this.accno = accno;
        this.balance += balance;
    }

    public void showDetails() {
        System.out.println("Customer name : " + this.name);
        System.out.println("Customer phoneNo : " + this.phoneNo);
        System.out.println("Account no : " + this.accno);
        System.out.println("Account balance : " + this.balance);
    }
}

class Borrower extends Depositor {
    public int loanNo;
    public double loanAmt;

    Borrower(String name, String phoneNo, int accno, int loanNo, double loanAmt) {
        super(name, phoneNo, accno, 0);
        this.loanNo = loanNo;
        this.loanAmt = loanAmt;

        balance -= loanAmt;
    }

    public void showDetails() {
        System.out.println("Customer name : " + this.name);
        System.out.println("Customer phoneNo : " + this.phoneNo);
        System.out.println("Account no : " + this.accno);
        System.out.println("Account balance : " + this.balance);
        System.out.println("Loan no : " + this.loanNo);
        System.out.println("Loan amount : " + this.loanAmt);
    }
}

public class Slip17 {
    public static void main(String[] args) {
        Customer c1 = new Depositor("Pinky", "8669656968", 69, 22000);
        c1.showDetails();
        Customer c2 = new Depositor("Phaguniya", "7757002303", 70, 21999);
        c2.showDetails();

        Customer c3 = new Borrower("Simran", "9096215009", 69, 101, 6000);
        c3.showDetails();
    }
}
