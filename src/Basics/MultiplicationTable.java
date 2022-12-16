package Basics;

public class MultiplicationTable {
    public static void main(String[] args) {
        //Print the multiplication table of a given number N.
        // N=9 then print 9,18,27,......90.

        int n = 2;

        for(int i=1;i<=10;i++){
            int product = i*n;
            System.out.print(product+" ");
        }
    }
}
