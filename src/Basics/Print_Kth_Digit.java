package Basics;

public class Print_Kth_Digit {
    public static void main(String[] args) {
        /*
        Given two numbers A and B, find Kth digit from right of A^B
        Input: A = 3,B = 3,K = 1
        Output: 7
        Explanation: 3^3 = 27 and 1st digit from right is 7
         */

        int a=9,b=3,k=2;
        int digit=k;
        int rem=0;
        int result = (int)Math.pow(a,b);
        int number = result;

        while(k-->0){
            rem = result%10;
            result/=10;
        }
        System.out.println(digit +" digit of "+number+" from right is: "+rem);
    }
}
