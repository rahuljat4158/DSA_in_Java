package Basics;

public class Reverse_Digits {
    public static void main(String[] args) {
        /*
        Input : 122
        Output: 221
        Explanation: By reversing the digits of number, number will change into 221.
         */

        int n = 122;
        String str = "";

        while(n>0){
            int rem = n%10;
            str = str + rem;
            n/=10;
        }

        int reverse = Integer.parseInt(str);
        System.out.println("Reverse no. is: " + reverse);

    }
}
