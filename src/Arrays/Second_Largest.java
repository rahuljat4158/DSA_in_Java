package Arrays;

import java.util.Scanner;

public class Second_Largest {
    public static void main(String[] args) {

        //Given an array Arr of size N, print second largest distinct element from an array.

        //one method doing it in two different ways

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //here we find the max
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        //now to find 2nd max we can iterate again excluding the max element in the array
        // and find max from the remaining elements

        int max2 = Integer.MIN_VALUE;
        for(int j=0;j<n;j++){
            if(arr[j]==max){
                continue;
            }
            else if(arr[j]>max2){
                max2 = arr[j];
            }
        }
        System.out.println("2nd largest element is: " + max2);



        /*  *******************************************************************
        or what we can do is just iterate it once
        Example -
        int i,max,max2;
        max = max2 = Integer.MIN_VALUE;

        for(i=0;i<arr.length;i++){
            if(arr[i]>max){
               max2 = max;
               max = arr[i];
            }
        }
        System.out.println("2nd largest element is: " + max2);

        both will give same output....also both code are saying the same thing

        ***************************************************************************
         */

    }
}
