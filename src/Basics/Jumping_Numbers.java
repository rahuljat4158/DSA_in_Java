package Basics;
import java.util.*;

public class Jumping_Numbers {
    public static void main(String[] args) {
        /*
        Given a positive number X.
        Find the largest Jumping Number which is smaller than or equal to X.
        Jumping Number: A number is called Jumping Number
        if all adjacent digits in it differ by only 1.
        All single-digit numbers are considered as Jumping Numbers.
        For example 7, 8987 and 4343456 are Jumping numbers but 796, 677 and 89098 are not.
         */

        int n = 50;

        while(n>0){
            int original = n;
            int digit = original%10;
             original = original/10;
             if(Math.abs(digit-original%10)!=1){
                 n--;
             }
             else{
                 System.out.println(n);
                 break;
             }


        }
    }
}
