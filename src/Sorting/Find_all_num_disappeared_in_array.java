package Sorting;

import java.util.*;

public class Find_all_num_disappeared_in_array {
    public static void main(String[] args) {
        //Given an array nums of n integers where nums[i] is in the range [1, n],
        //return an array of all the integers in the range [1, n] that do not appear in nums.

        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(disappeared(arr));
    }

    static List<Integer> disappeared(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != (index+1)){
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
