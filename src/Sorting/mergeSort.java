package Sorting;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,3,5,2,1};
        arr = mergeSortfn(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] mergeSortfn(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSortfn(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSortfn(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    static int[] merge(int[] first,int[] second){
        int[] mix = new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;

        //while any 1 of the array is completed
        while (i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        //now any 1 of the array is still not completed
        //so copy the rest of the uncompleted array to the end of the mix array.

        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k] = first[j];
            j++;
            k++;
        }

        return mix;
    }
}
