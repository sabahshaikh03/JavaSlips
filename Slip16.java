/*
    Write a program to find the Square of given number using function interface. 
*/

interface Square {
    public void square(double n);
}

public class Slip16 implements Square {
    public void square(double n) {
        System.out.println("Square : " + n * n);
    }

    public static void main(String[] args) {
        Slip16 sq = new Slip16();
        sq.square(2);
    }
}
