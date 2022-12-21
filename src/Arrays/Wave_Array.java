package Arrays;

import java.util.*;

public class Wave_Array {
    public static void main(String[] args) {
        //Given a sorted array arr[] of distinct integers. Sort the array into a
        // wave-like array(In Place).In other words, arrange the elements into a
        // sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....
        // If there are multiple solutions, find the lexicographically smallest one.

        Scanner sc = new Scanner(System.in);
        //size of array
        int n = sc.nextInt();
        //initialize array
        int[] arr = new int[n];
        //giving input in array
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //since it is a sorted array than third element is greater than second.
        //so we can say if we swap 1st and 2nd than 2nd element will become greater than first
        //and will remain smaller than third.
        for(int i=0;i<n-1;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
