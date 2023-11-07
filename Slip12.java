/*
 * Write a program to create parent class College(cno, cname, caddr) and derived
 * class
 * Department(dno, dname) from College. Write a necessary methods to display
 * College details.
 */

class College {
    int cno;
    String cname;
    String caddr;

    College(int cno, String name, String address) {
        this.cno = cno;
        this.cname = name;
        this.caddr = address;
    }

    public void displayDetails() {
        System.out.println("College no : " + this.cno);
        System.out.println("College name : " + this.cname);
        System.out.println("College address : " + this.caddr);
    }

}

class Department extends College {
    int dno;
    String dname;

    Department(int dno, String depName, int collegeNo, String collegeName, String address) {
        super(collegeNo, collegeName, address);

        this.dno = dno;
        this.dname = depName;
    }

    public void displayDetails() {
        System.out.println("College no : " + this.cno);
        System.out.println("College name : " + this.cname);
        System.out.println("College address : " + this.caddr);
        System.out.println("Department no : " + this.dno);
        System.out.println("Department name : " + this.dname);
    }

}

public class Slip12 {
    public static void main(String[] args) {
        Department d = new Department(10, "Comp sci", 1, "AGC", "Pune");
        d.displayDetails();

        College c = new Department(11, "it", 101, "AGC", "Pune");
        c.displayDetails();
    }
}