package Basics;

public class Perfect_Numbers {
    public static void main(String[] args) {
        //Given a number N, check if a number is perfect or not.
        // A number is said to be perfect if sum of all its factors excluding
        // the number itself is equal to the number.

        int n = 496;
        int original=n;
        int sum = 0;
        int i;
        for(i=1;i<n;i++){
            if(original%i==0){
                sum = sum+i;
            }
        }


        if(original==sum){
            System.out.println("Yes, "+original + " is perfect no.");
        }
        else{
            System.out.println("No, "+original + " is perfect no.");
        }
    }
}


