package Searching;

import java.util.Scanner;

public class No_of_occurrence_usingBinary {
    public static void main(String[] args) {
        //Given a sorted array Arr of size N and a number X, you need to find the number
        //of occurrences of X in Arr.

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
        int result = count(arr,target,n);
        System.out.println("No. of occurrence of "+target+" is: "+result);
    }

    //here we are going to find the first occurrence of the given element. let it be i.
    static int first(int[] arr,int start,int end,int target,int n){

        if(end>=start){
            int mid=start+(end-start)/2;
            if((mid==0 || target>arr[mid-1]) && target==arr[mid]){
                return mid;
            }
            //{1, 1, 2, 2, 2, 2, 3}
            else if(target>arr[mid]){
                return first(arr,mid+1,end,target,n);
            }
            else{
                return first(arr,start,mid-1,target,n);
            }
        }
        return -1;
    }

    //here we are going to find the last occurrence of the given element. let it be j.
    static int last(int[] arr,int start , int end  ,int target ,int n){

        if(end>=start){
            int mid = start+(end-start)/2;

            if((mid==n-1 || target<arr[mid+1]) && target==arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                return last(arr,start,mid-1,target,n);
            }
            else{
                return last(arr,mid+1,end,target,n);
            }
        }
        return -1;
    }

    //now after finding first and last we can calculate occurrence by formula occurrence=(j-i+1).
    static int count(int[] arr,int target,int n){

        int i,j;
        i = first(arr,0,n-1,target,n);

        if(i==-1){
            return i;
        }

        j = last(arr,i,n-1,target,n);

        return j-i+1;
    }
}
