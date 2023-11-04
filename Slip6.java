/*
    Write a program to display the Employee(Empid, Empname, Empdesignation, Empsal)
information using toString().
*/
public class Slip6 {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "abc", "Manager", 100000000d);
        System.out.println(emp.toString());
    }
}

class Employee {
    int empId;
    String empName;
    String empDesg;
    Double empSal;

    Employee(int empId, String empName, String empDesg, Double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empDesg = empDesg;
        this.empSal = empSal;
    }

    public String toString() {
        return "Emp id : " + this.empId +
                "\nEmp name : " + this.empName +
                "\nEmp Designation : " + this.empDesg +
                "\nEmp Salary : " + this.empSal;
    }
}
