package Searching;

import java.util.Scanner;

public class Linear_search_algorithm {
    public static void main(String[] args) {
        //Linear Search is defined as a sequential search algorithm that starts at
        // one end and goes through each element of a list until the desired element is
        // found, otherwise the search continues till the end of the data set. It is the
        // easiest searching algorithm.

        Scanner sc = new Scanner(System.in);
        //size of array
        int n = sc.nextInt();
        //initialize array
        int[] arr = new int[n];
        //giving input in array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i;
        int target = sc.nextInt();
        for (i = 0; i < n; i++) {
            if (target == arr[i]) {
                System.out.println("Found element at: " + i);
                break;
            }
        }
        if(i==n){
            System.out.println(-1);
        }
    }
}
