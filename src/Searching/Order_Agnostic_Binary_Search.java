package Searching;

import java.util.Scanner;

public class Order_Agnostic_Binary_Search {
    public static void main(String[] args) {
        //Order-Agnostic Binary Search is a modified version of Binary Search algorithm.
        //Here in this modified binary search comes with one more condition checking.
        //The intuition behind this algorithm is what if the order of the sorted array is
        //not given. So here check that the value of the first element is greater or smaller
        //than the last element.

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
        int ans = orderAgBS(arr,target);
        System.out.println(ans);


    }

    static int orderAgBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        //with this condition we can find if its ascending or descending.
        boolean isAsc = arr[start]<arr[end];

        //since start always comes before end , so it can not overtake when finding mid.
        while (start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else if(target<arr[mid]){
                    end=mid-1;
                }
            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }
                else if(target>arr[mid]){
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}

