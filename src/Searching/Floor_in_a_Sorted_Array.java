package Searching;

import java.util.Scanner;

public class Floor_in_a_Sorted_Array {
    public static void main(String[] args) {
        //Given a sorted array arr[] of size N without duplicates, and given a value x.
        //Floor of x is defined as the largest element K in arr[] such that K is
        //smaller than or equal to x. Find the index of K(0-based indexing).

        Scanner sc = new Scanner(System.in);
        //size of array
        int n = sc.nextInt();
        //initialize array
        int[] arr = new int[n];
        //giving input in array
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int start = 0 , end = n-1;
        int index = floorBinarySearch(arr,start,end,target);
        System.out.println("Required element index is: "+index);


    }

    static int floorBinarySearch(int[] arr,int start,int end ,int target){

        if(start>end){
            return -1;
        }
        if(target>=arr[end]){
            return end;
        }

        int mid = start+(end-start)/2;

        if(arr[mid]==target){
            return mid;
        }
        if(mid>0 && arr[mid-1]<=target && arr[mid]>target){
            return mid-1;
        }
        if(target<arr[mid]){
            return floorBinarySearch(arr,start,mid-1,target);
        }

        return floorBinarySearch(arr,mid+1,end,target);
    }
}
