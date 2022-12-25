package Searching;

public class InfiniteArraySearch {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;

        int result = ans(arr,target);
        System.out.println(result);

    }
    static int ans(int[] arr , int target){
        int start = 0;
        int end = 1;

        while(arr[end]<target){
            int newStart = end+1;
            //update end to previous end + (2*size_Of_box)
            end = end + (end-start+1)*2;
            start = newStart;
        }
        return search(arr,start,end,target);
    }

    static int search(int[] arr,int start , int end , int target){

        while(start<=end){
            int mid = start + (end - start)/2;
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
