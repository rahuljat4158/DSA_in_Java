package Basics;

public class SeriesAP {
    public static void main(String[] args) {
        //Given the first 2 terms A1 and A2 of an Arithmetic Series.
        // Find the Nth term of the series.
        /*
        Input: A1=2
               A2=3
               N=4
        Output: 5

        Explanation:  The series is 2,3,4,5,6....
                      Thus,4th term is 5.
         */

        int a1 = 2,a2=3,n=4;
        int d = a2-a1;
        int nth = a1+(n-1)*d;
        System.out.println("Nth term of AP is: " +nth);
    }
}
