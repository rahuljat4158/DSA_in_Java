package Basics;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        /*
        For a given 3 digit number, find whether it is armstrong number or not.
        An Armstrong number of three digits is an integer such that the sum of the cubes
        of its digits is equal to the number itself.
        Return "Yes" if it is a armstrong number else return "No".
        NOTE: 371 is an Armstrong number since 33 + 73 + 13 = 371
         */

        int n = 153;
        int sum=0;
        int original = n;

        while(n>0){
            int digit = n%10;
            sum = sum + (int)Math.pow(digit,3);
            n/=10;
        }

        if(original==sum){
            System.out.println("Yes, it is a Armstrong Number");
        }
        else{
            System.out.println("No, it is a Armstrong Number");
        }
    }
}
