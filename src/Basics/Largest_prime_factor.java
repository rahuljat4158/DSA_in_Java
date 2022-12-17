package Basics;

public class Largest_prime_factor {
    public static void main(String[] args) {

        //Given a number N, the task is to find the largest prime factor of that number.
        int n = 24;
        int factor = 0;
        for(int i=2;i<n;i++){

            while(n>0){
                if(n%i==0){
                    n = n/i;
                    factor = i;
                }
                else{
                    break;
                }
            }

        }
        if(n>2){
            factor = n;
        }
        System.out.println(factor);

    }
}
