package Basics;

public class GCD_of_array {
    public static void main(String[] args) {
        //Given an array of N positive integers, find GCD of all the array elements.
        //Input: N = 3, arr[] = {2, 4, 6}
        //Output: 2
        //Explanation: GCD of 2,4,6 is 2.

        int[] arr = {16,8,24,4};
        int result = arr[0];

        for(int i=1; i<arr.length; i++){
            result = gcd(arr[i], result);
        }
        System.out.print("GCD: "+result);
    }

    public static int gcd(int a , int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
