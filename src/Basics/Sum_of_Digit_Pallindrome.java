package Basics;

public class Sum_of_Digit_Pallindrome {
    public static void main(String[] args) {
        /*
        Given a number N.Find if the digit sum(or sum of digits) of N is a Palindrome number
        or not.Note:A Palindrome number is a number which stays
        the same when reversed.Example- 121,131,7 etc.
         */

        int n = 56;
        int sum = 0;

        //Calculate sum
        while(n>0){
            int digit = n%10;
            sum = sum + digit;
            n/=10;
        }
        // now check if palindrome or not
        int original = sum;
        String str = "";
        while(sum>0){
            int rem = sum%10;
            str = str+rem;
            sum/=10;
        }
        int palindrome = Integer.parseInt(str);

        if(original==palindrome){
            System.out.println("Yes, the sum of the digit of integer is Palindrome");
        }
        else{
            System.out.println("No, the sum of the digit of integer is Palindrome");
        }



    }
}
