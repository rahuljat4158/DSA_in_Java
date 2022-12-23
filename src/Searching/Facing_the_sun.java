package Searching;

import java.util.Scanner;

public class Facing_the_sun {
    public static void main(String[] args) {
        //Given an array H representing heights of buildings. You have to count the
        //buildings which will see the sunrise (Assume : Sun rise on the side of array
        //starting point). Note : Height of building should be strictly greater than
        //height of buildings in left in order to see the sun.


        Scanner sc = new Scanner(System.in);
        //size of array
        int n = sc.nextInt();
        //initialize array
        int[] arr = new int[n];
        //giving input in array
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count=1;
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
