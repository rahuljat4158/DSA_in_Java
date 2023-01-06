package Recursion.ArrayQues;

public class linearSearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {2,3,1,6,4,10,16};
        int target = 9;
        System.out.println(linearSearch(arr,target,0));
    }
    static int linearSearch(int[] arr,int target,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return linearSearch(arr,target,i+1);
    }
}
