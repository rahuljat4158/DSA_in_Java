package Arrays;

import java.util.Scanner;

public class Min_distance_between_two_numbers {
    public static void main(String[] args) {
        //You are given an array A, of N elements.
        // Find minimum index based distance between two elements of the array, x and y.


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        //for taking input in array
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int y = sc.nextInt();

        int i=0,j=0;
        int min_dist = Integer.MAX_VALUE;

        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if((arr[i]==x && arr[j]==y || arr[i]==y && arr[j]==x) && min_dist>Math.abs(i-j)){
                    min_dist = Math.abs(i-j);
                }
            }
        }
        if(min_dist>n){
            min_dist = -1;
        }
        System.out.println(min_dist);
    }
}
