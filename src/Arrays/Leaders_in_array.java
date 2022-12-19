package Arrays;

import java.util.Scanner;

public class Leaders_in_array {
    public static void main(String[] args) {
        //Given an array A of positive integers.
        // Your task is to find the leaders in the array.
        // An element of array is leader if it is greater than or equal
        // to all the elements to its right side.
        // The rightmost element is always a leader.


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        //for taking input in array
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            int j;
            for(j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    break;
                }
            }
            //This means when loop didnt break that means when loop is complete j value
            //reached n that is j==n.
            if(j==n){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
