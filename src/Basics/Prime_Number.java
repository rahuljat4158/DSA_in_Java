package Basics;

public class Prime_Number {
    public static void main(String[] args) {
        //For a given number N check if it is prime or not.
        // A prime number is a number which is only divisible by 1 and itself.

        int n = 27;
        boolean isPrime = true;

        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime==true){
            System.out.println(n+ " is Prime no.");
        }
        else {
            System.out.println(n+ " is not Prime no.");
        }
    }
}
