package Basics;

public class ClosestNumber {
    public static void main(String[] args) {
        /*
        Given non-zero two integers N and M.
        The problem is to find the number closest to N and divisible by M.
        If there are more than one such number,
        then output the one having maximum absolute value.
         */
        int n=14 , m=4;
        int closest;
        //find quotient
        int q = n/m;

        //now 1st closest no.
        int n1 = m*q;
        //2nd closest
        int n2 = (m*n)>0?(m*(q+1)):(m*(q-1));

        if(Math.abs(n-n1)<Math.abs(n-n2)){
             closest = n1;
        }
        else{
             closest = n2;
        }
        System.out.println("Closest no. is: " + closest);
    }
}
