package Searching;

public class RotatedBinary_search {
    public static void main(String[] args) {
        int[] arr = {10,12,15,18,3,5,7,9};
        int target = 3;
        int peak = rotatedPeak(arr);
        System.out.println("Peak element index is: "+peak);
        int ans = search(arr,target,0,peak);

        if(ans==-1){
            ans = search(arr,target,peak+1,arr.length-1);
        }
        System.out.println("Target index is: "+ans);

    }

    static int rotatedPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[mid]<=arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    static int search(int[] arr,int target , int start , int end){

        while(start<=end){
            int mid = start+(end-start)/2;
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
