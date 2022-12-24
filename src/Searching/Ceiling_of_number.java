package Searching;

import java.util.Scanner;

public class Ceiling_of_number {
    public static void main(String[] args) {
        //ceiling of an array means we have to find the smallest element in the sorted array
        //that is greater and equal to the targeted element.

        Scanner sc = new Scanner(System.in);
        //size of array
        int n = sc.nextInt();
        //initialize array
        int[] arr = new int[n];
        //giving input in array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = ceilingNumber(arr, target);
        System.out.println("Ceiling index of element is: " + ans);


    }

    static int ceilingNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        /*
        if(target>arr[end]){
            return end+1;
        }
        return start+1;
         */
        return start;
    }
}
