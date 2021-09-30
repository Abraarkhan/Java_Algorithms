// Java program to Print Diamond Star Pattern
// Using do-while loop

import java.io.*;
public class GFG {
    public static void main(String[] args)
    {
        int number = 7;
        int m = 1;
        int n;
        do {
            n = 1;
            do {

                System.out.print(" ");
 
            }
            while (++n <= number - m + 1);
            n = 1;
            do {
                System.out.print("*");
            }
            while (++n <= m * 2 - 1);
            System.out.println();
        }
 
        while (++m <= number);
        m = number - 1; 
        do {
            n = 1;
            do {
                System.out.print(" ");
            } while (++n <= number - m + 1);
            n = 1;
            do {
                System.out.print("*");
            } while (++n <= m * 2 - 1);
            System.out.println();
        }
        while (--m > 0);
    }
}