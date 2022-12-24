package Searching;

import java.util.Scanner;

public class Floor_of_number_simple_approach {
    public static void main(String[] args) {
        //Floor of number means the element which is the greatest number smaller or equal to
        //the target number.
        //this is the second and easy approach
        //In this when while condition is false means start and end overlap that means
        //we didn't find the element but its between start and end so for floor we
        //can return end.

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
        int ans = floorNumber(arr,target);
        System.out.println("Floor index of element is: " + ans);
    }

    static int floorNumber(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target==arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = arr[mid]+1;
            }
        }
        return end;
    }
}
