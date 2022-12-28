package Sorting;

public class Find_duplicate_number {
    public static void main(String[] args) {
        //Given an array of integers nums containing n + 1 integers where each integer
        //is in the range [1, n] inclusive. There is only one repeated number in nums,
        //return this repeated number. You must solve the problem without modifying the
        //array nums and uses only constant extra space.
        //Hint- Use Cyclic sort!

        int[] arr = {3,1,3,4,2};
        int ans = duplicate(arr);
        System.out.println(ans);
    }

    static int duplicate(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                int correct = arr[i]-1;
                if(arr[i]!=arr[correct]){
                    swap(arr,i,correct);
                }
                else{
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
