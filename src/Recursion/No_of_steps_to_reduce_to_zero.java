package Recursion;

public class No_of_steps_to_reduce_to_zero {
    public static void main(String[] args) {
        //Given an integer num, return the number of steps to reduce it to zero
        //In one step, if the current number is even, you have to divide it by 2,
        //otherwise, you have to subtract 1 from it.

        int n = 14;
        System.out.println(numberOfSteps(n));

    }

    static int numberOfSteps(int n){
        return helper(n,0);
    }
    static int helper(int n,int count){
        if(n==0){
            return count;
        }
        if(n%2==0){
            return helper(n/2,count+1);
        }
        return helper(n-1,count+1);
    }
}
