package Basics;

public class Sum_of_prime_to_n {
    public static void main(String[] args) {
        //Given a positive integer N, find the sum of all prime numbers
        // between 1 and N(inclusive).

        int n = 10;
        int or = n;
        int sum = 0;

        while(n>1){
            boolean isPrime = true;
            for(int i=n-1;i>=2;i--){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime==true){
                sum = sum+n;
            }
            n--;
        }
        System.out.println("Sum of all prime from 1 to " +or+" is: " + sum);
    }
}
