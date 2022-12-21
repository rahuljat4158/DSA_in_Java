package Arrays;

import java.util.Scanner;

public class Majority_Element {
    public static void main(String[] args) {
        //Given an array A of N elements. Find the majority element in the array.
        // A majority element in an array A of size N is an element
        // that appears more than N/2 times in the array.

        Scanner sc = new Scanner(System.in);
        //size of array
        int n = sc.nextInt();
        //initialize array
        int[] arr = new int[n];
        //giving input in array
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max=0 , element=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>max){
                max = count;
                element = arr[i];
            }
        }
        System.out.println("Majority Element is: " + element + " with occurence: "+ max);

    }
}
