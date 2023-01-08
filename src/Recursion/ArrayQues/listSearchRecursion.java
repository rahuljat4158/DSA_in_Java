package Recursion.ArrayQues;

import java.util.ArrayList;

public class listSearchRecursion {
    public static void main(String[] args) {
        //Here as there are multiple occurrence of target we create list using Arraylist
        //and search it and add target to list.

        int[] arr = {2,3,1,9,6,4,9,10,16};
        int target = 9;
        ArrayList<Integer> ans = listSearch(arr,target,0,new ArrayList<>());
        System.out.println(ans);

    }

    static ArrayList<Integer> listSearch(int[] arr,int target,int i,ArrayList<Integer> list){
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        return listSearch(arr,target,i+1,list);
    }
}
