/*
 *   Write a program to accept a number from the user, if number is zero then throw user defined
 * exception “Number is 0” otherwise check whether no is prime or not (Use static keyword).
 */

class NumberIsZeroException extends Exception {
    NumberIsZeroException() {
        System.out.println("Number is 0");
    }
}

public class Slip14 {

    public static void isPrime(int num) {

        try {

            boolean isPrime = true;

            if (num == 0) {
                throw new NumberIsZeroException();
            }

            if (num == 1) {
                System.out.println("One is not a prime number");
                return;
            }

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.println("Number is prime");
            } else {
                System.out.println("Number is not prime");
            }
        } catch (NumberIsZeroException e) {
        }

    }

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        isPrime(num);
    }

}
