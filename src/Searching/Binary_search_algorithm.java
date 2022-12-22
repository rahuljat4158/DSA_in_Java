package Searching;

import java.util.Scanner;

public class Binary_search_algorithm {
    public static void main(String[] args) {
        //Binary Search is a searching algorithm used in a sorted array by
        //repeatedly dividing the search interval in half. The idea of binary
        //search is to use the information that the array is sorted and reduce
        //the time complexity to O(Log n).

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
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }

    static int binarySearch(int[] arr ,int target){

        int start=0;
        int end=arr.length-1;

        if(arr.length==0){
            return -1;
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
