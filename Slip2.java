/*
Write a program to read the First Name and Last Name of a person, his weight and height using
 command line arguments. Calculate the BMI Index which is defined as the individual's body mass
 divided by the square of their height.
 (Hint : BMI = Wts. In kgs / (ht)2
) 
 
*/

public class Slip2 {
    public static void main(String[] args) {
        String firstName = args[0];
        String lastName = args[1];

        Double weight = Double.parseDouble(args[2]);
        Double height = Double.parseDouble(args[3]);

        Double BMI = (weight / (height * height)) * 10000;

        System.out.println("Hello you are : " + firstName + " " + lastName);
        System.out.println("Your BMI is : " + BMI);
    }
}
