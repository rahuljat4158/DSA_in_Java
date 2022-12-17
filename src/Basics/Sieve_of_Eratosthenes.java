package Basics;

public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {

        ///Given a number N, calculate the prime numbers up to N
        // using Sieve of Eratosthenes.
        //Input: N = 10
        //Output: 2 3 5 7
        //Explanation: Prime numbers less than equal to N are 2 3 5 and 7.

        int n = 13;
        while(n>1){
            boolean isPrime = true;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
                else{
                    continue;
                }
            }
            if(isPrime==true){
                System.out.print(n+"  ");
            }
            n--;
        }




    }
}
