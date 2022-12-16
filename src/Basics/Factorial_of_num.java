package Basics;

public class Factorial_of_num {
    public static void main(String[] args) {
        //Given a positive integer, N. Find the factorial of N.

        int n = 5;
        int org = n;
        int factorial = 1;

        while(n>0){
            factorial = factorial*n;
            n--;
        }
        System.out.println("Factorial of " + org+ " is: " +factorial);
    }
}
