package Arrays;

import java.util.Scanner;

public class Count_smaller_elements {
    public static void main(String[] args) {

        //Given an sorted array A of size N.
        //Find number of elements which are less than or equal to given element X.

        Scanner sc = new Scanner(System.in);
        //size of array
        int n = sc.nextInt();
        //initialize array
        int[] arr = new int[n];
        //giving input in array
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // count elements smaller than k
        int k = sc.nextInt();
        int count = 0;

        for(int i=0;i<n;i++){
            if(arr[i]<=k){
                count++;
            }
        }
        System.out.println("No. of element smaller or equal to: " + k + " are " + count);
    }
}
