package Basics;

public class GCD_Two_Num {
    public static void main(String[] args) {

        /*
        Given two positive integers A and B, find GCD of A and B.
        Example 1: Input: A = 3, B = 6
                   Output: 3
                   Explanation: GCD of 3 and 6 is 3
         */

        int a=3,b=6;
        int gcd = 1;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        int lcm = (a*b)/gcd;
        System.out.println("GCD: "+ gcd +"\n"+ "LCM: " +lcm);
    }
}
