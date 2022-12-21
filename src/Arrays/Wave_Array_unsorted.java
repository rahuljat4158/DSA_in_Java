package Arrays;

import java.util.*;

public class Wave_Array_unsorted {
    public static void main(String[] args) {
        //Given an unsorted array of integers, sort the array into a wave-like array.
        // An array ‘arr[0..n-1]’ is sorted in wave form
        // if arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..

        Scanner sc = new Scanner(System.in);
        //size of array
        int n = sc.nextInt();
        //initialize array
        int[] arr = new int[n];
        //giving input in array
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1;i<n-2;i+=2){
            if(arr[i]>arr[i-1]){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
            else if(arr[i]>arr[i+1]){
                int temp1 = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp1;
            }
        }

        //Now will see that the given unsorted array is in the wave form
        //i.e: arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..

        System.out.println(Arrays.toString(arr));
    }
}
