/*
 Write a program to accept ‘n’ name of cities from the user and sort them in ascending
 order.
 */

import java.util.Arrays;

public class Slip3 {
    public static void main(String[] args) {

        String[] cities = args;

        Arrays.sort(cities);

        for (String city : cities) {
            System.out.print(city + "\t");
        }

        System.out.println();

    }
}
