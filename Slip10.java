/*
Write a program to find the cube of given number using functional interface.
*/
class Slip10 {
    public static void main(String[] args) {
       CubeCalculator c= new CubeCalculator();
       c.cube(5);
    }
}

interface Cube{
    public void cube(int n);
}
class CubeCalculator implements Cube{
    public void cube(int n){
        System.out.println("Cube is"+" "+n*n*n);
    }
}