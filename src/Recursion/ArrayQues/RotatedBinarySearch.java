package Recursion.ArrayQues;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,1,2,3,4};
        int target = 7;
        int ans = rotateBinary(arr,target,0,arr.length-1);
        System.out.println(ans);

    }
    static int rotateBinary(int[] arr,int target,int s,int e){

        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            if(target>=arr[s] && target<=arr[mid]){
                return rotateBinary(arr,target,s,mid-1);
            }
            else{
                return rotateBinary(arr,target,mid+1,e);
            }
        }
        if(target>=arr[mid] && target<=arr[e]){
            return rotateBinary(arr,target,mid+1,e);
        }
        return rotateBinary(arr,target,s,mid-1);
    }
}
