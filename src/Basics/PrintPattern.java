package Basics;

public class PrintPattern {
    public static void main(String[] args) {
        /*
              You are given a number N. You need to print the pattern for the given value of N.
              For N = 2 the pattern will be
              2 2 1 1
              2 1
         */

        int n = 3;
        for(int i=0;i<n;i++){
            for(int j=n;j>=1;j--){
                for(int k=n;k>i;k--){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
