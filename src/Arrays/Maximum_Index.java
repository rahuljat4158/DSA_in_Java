package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Index {
    public static void main(String[] args) {
        //Given an array A[] of N positive integers. The task is the find
        //the maximum of j - i subjected to the constraint of A[i] < A[j] and i < j.

        Scanner sc = new Scanner(System.in);
        //size of array
        int n = sc.nextInt();
        //initialize array
        int[] arr = new int[n];
        //giving input in array
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //For brute force approach we use 2 loops and T.C O(n^2)
        int diff=0;
        int maxDiff=0;
        for(int i=0;i<n-1;i++){
            for(int j=n-1;j>=1;j--){
                if(arr[j]>=arr[i] && j>=i){
                   diff = j-i;
                }
                if(diff>maxDiff){
                    maxDiff = diff;
                }
            }
        }
        System.out.println(maxDiff);


    }
}
