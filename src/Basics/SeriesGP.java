package Basics;

public class SeriesGP {
    public static void main(String[] args) {
        /*
        Given the A and R i,e first term and common ratio of a GP series.
        Find the Nth term of the series.
        formula is nth = a * r^(n-1);
         */
        int a = 2 , r = 2 , n =4;
        int nth = a * (int)Math.pow(r,n-1);
        System.out.println("Nth term of GP is: " + nth);
    }
}
