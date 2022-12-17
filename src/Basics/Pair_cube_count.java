package Basics;

public class Pair_cube_count {
    public static void main(String[] args) {
        /*
        Given N, count all ‘a’(>=1) and ‘b’(>=0) that satisfy the condition a^3 + b^3 = N.
        Input: N = 9
        Output: 2
        Explanation: There are two solutions: (a=1, b=2) and (a=2, b=1).
         */

        int n = 27;
        int count = 0;

        // Check for each number 1 to cbrt(n)
        for (int i = 1; i <= Math.cbrt(n); i++)
        {
            // Store cube of a number
            int cb = i*i*i;

            // Subtract the cube from given n
            int diff = n - cb;

            // Check if the difference is also
            // a perfect cube
            int cbrtDiff = (int) Math.cbrt(diff);

            // If yes, then increment count
            if (cbrtDiff*cbrtDiff*cbrtDiff == diff)
                count++;
        }

        System.out.println(count);
    }
}
