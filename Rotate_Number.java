// Problem Statement in Description

// https://www.pepcoding.com/resources/online-java-foundation/getting-started/rotate-a-number-official/ojquestion#

import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner scn = new Scanner(System.in);
     
     int n = scn.nextInt();
     int k = scn.nextInt();
     
     System.out.println(rotate_number(n, k));
    
    }
    
    static int rotate_number(int n, int k) {
        int digit_count = (int) Math.ceil(Math.log10(n));
        int power = (int) Math.pow(10, digit_count-1);
        
        k = k % digit_count;
        
        if (k < 0){
            k = k + digit_count;    
        }
        
        int div = (int) Math.pow(10, k);
        
        int q = n / div;
        int r = n % div;
        
        int multiplier = (int) Math.pow(10, digit_count - k);
        
        int rotated_num = r * multiplier + q;
        
        // while (k-- >= 1) {
        //     int digit = (int) n % 10;
        //     n /= 10;
        //     n += digit * power;
        // }
        
        return rotated_num;
    }
   }
   
   /*
   Input:
   12345
   2
   Output: 45123
   
   Input:
   12345
   7
   Output: 45123
   
   Input:
   12345
   -2
   Output: 34512
   */
