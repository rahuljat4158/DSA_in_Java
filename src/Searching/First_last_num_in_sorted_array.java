package Searching;
import java.util.*;

public class First_last_num_in_sorted_array {
    public static void main(String[] args) {
        //Here in this question we have to find the first and last occurrence of the
        //target element. We can make two functions first will decide the first and last
        //index of the target. Second will give the answer in required format.

        int[] arr = {1,2,3,4,7,7,7,7,8,9,12};
        int n = arr.length;
        int target = 7;

        int[] ans = searchRange(arr,target);

        System.out.println(Arrays.toString(ans));



    }

    static int[] searchRange(int[] arr,int target){

        int[] ans = {-1,-1};
        ans[0] = search(arr,target,true);
        ans[1] = search(arr,target,false);

        return ans;

    }

    static int search(int[] arr ,int target , boolean findFirstIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                //potential ans
                ans = mid;
                if(findFirstIndex)
                    end = mid-1;
                else
                    start = mid+1;
            }
        }
        return ans;

    }
}
