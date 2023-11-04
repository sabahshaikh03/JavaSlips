/*  Q1. Write a Program to print all Prime numbers in an array of ‘n’ elements.
(use command line arguments)

*/

/*
 
*/

class Slip1 {
    public static void main(String[] args) {

        int n = args.length;
        int num, isPrime;

        for (int i = 0; i < n; i++) {
            isPrime = 1;
            num = Integer.parseInt(args[i]);

            for (int j = num - 1; j >= 2; j--) {
                if (num % j == 0) {
                    isPrime = 0;
                    break;
                }
            }

            if (isPrime == 1) {
                System.out.println(num + " is prime.");
            } else {
                System.out.println(num + " is not prime.");
            }
        }
    }
}