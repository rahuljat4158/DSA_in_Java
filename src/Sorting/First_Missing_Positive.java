package Sorting;

public class First_Missing_Positive {
    public static void main(String[] args) {
        //Given an unsorted integer array nums, return the smallest missing positive
        //integer. You must implement an algorithm that runs in O(n) time and
        //uses constant extra space. Use cyclic sort.

        int[] arr = {7,8,9,10,11,12};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index+1){
                return index+1;
            }
        }
        return arr.length+1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
