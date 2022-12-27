package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getmaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static int getmaxIndex(int[] arr,int start,int last){
        int max = start;
        for(int i=start;i<=last;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
