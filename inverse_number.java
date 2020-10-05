// Problem statement in description

// Inverse of a number - Pepcoding
// https://www.pepcoding.com/resources/online-java-foundation/getting-started/inverse-of-a-number-official/ojquestion#

import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        long n = scn.nextInt();

        System.out.println(inverse(n));
     }

     static long inverse(long n){
         long inv = 0;    // Inverse number
         long pos = 1;    // Variable to keep track of digit being extracted starting from rightmost digit

         while (n != 0){
             int digit = (int) n % 10;    // Get last digit of the number
             
             // create the new number at inverted position and add to inverse number
             
             inv += pos * (int) Math.pow(10, digit-1);
             
             n /= 10;   // Remove the last digit so that next rightmost digit can be extracted

            pos++;     // Increment the position of the digit being extracted
         }

         return inv;
     }
}

/*
Input: 426135
Output: 416253
*/
