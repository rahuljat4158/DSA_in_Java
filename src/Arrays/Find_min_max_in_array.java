package Arrays;

import java.util.Scanner;

public class Find_min_max_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //iterate the array to find min and max
        for(int i=0;i<n;i++){
            if(arr[i]>max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];
        }

        //print the max and min of array
        System.out.println("Max element in array is: "+ max);
        System.out.println("Min element in array is: "+ min);
    }
}
