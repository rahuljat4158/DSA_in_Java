package Searching;

public class find_element_in_mountainArray {
    public static void main(String[] args) {
        //Approach is like this first find peak than divide the array in ascending and descending
        //now search in first half that is ascending if found return the element if not than
        //search in descending using order agnostic search.
        int[] arr = {1,2,3,5,7,5,3,0};
        int target = 5;
        int ans = search(arr,target);
        System.out.println(ans);

    }
    static int search(int[] arr,int target){
        int peak = peak(arr);
        int firstTry = binarySearchOrderAgnostic(arr,0,peak,target);
        if(firstTry!=-1){
            return firstTry;
        }
        return binarySearchOrderAgnostic(arr,peak+1,arr.length-1,target);
    }
    static int peak(int[] arr){
        int start=0;int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }

    static int binarySearchOrderAgnostic(int[] arr,int start,int end,int target){

        //with this condition we can find if its ascending or descending.
        boolean isAsc = arr[start]<arr[end];

        //since start always comes before end , so it can not overtake when finding mid.
        while (start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else if(target<arr[mid]){
                    end=mid-1;
                }
            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }
                else if(target>arr[mid]){
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
