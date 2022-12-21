package Arrays;

import java.util.Scanner;

public class Max_SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //size of array
        int n = sc.nextInt();
        //initialize array
        int[] arr = new int[n];
        //giving input in array
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        /*
        // Brute for approach by finding max than
        // finding elements of sub array that give that max
        int start=0,end=0;
        int max=Integer.MIN_VALUE;
        for(int left=0;left<n;left++){
            int sum=0;
            for(int right=left;right<n;right++){
                sum = sum+arr[right];
                if(sum>max){
                    max = sum;
                    start=left;
                    end=right;
                }
            }
        }

        for(int k=start;k<=end;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        System.out.println(max);

         */

        //Now previous approach gives O(n^2) time complexity we can solve it efficiently by
        //using kadane's algorithm which will give O(n) time complexity

        int start = 0,end=0;
        int maxSoFar = arr[0] , maxEndingHere = arr[0];

        for(int i=1;i<n;i++){
            if(arr[i]>maxEndingHere + arr[i]){
                start = i;
                maxEndingHere = arr[i];
            }
            else{
                maxEndingHere = maxEndingHere + arr[i];
            }

            if(maxSoFar<maxEndingHere){
                maxSoFar = maxEndingHere;
                end = i;
            }
        }

        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(maxSoFar);



    }
}
