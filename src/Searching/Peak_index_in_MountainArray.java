package Searching;

public class Peak_index_in_MountainArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,5,4,2};

        int ans = mountainArray(arr);
        System.out.println(ans);

    }

    static int mountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            //if arr[mid] is less than arr[mid+1] means peak mid is in ascending part now
            //since its in ascending part and next element is greater than search in the part
            //above mid. So for that let start equal to mid+1.
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            //if arr[mid] is greater than arr[mid+1] means mid is in descending part
            //since its descending and next element is lesser so we dont need to search in
            //above part so search in previous part so let end equal to mid as mid+1 is already lesser.
            else if(arr[mid]>arr[mid+1]){
                end = mid;
            }
        }
        //now while condition is false because start=end and mid will be same
        //and pointing towards max element as both always try to find the largest in above
        //checks. So return whether start or end both are largest.
        return start;
    }
}
