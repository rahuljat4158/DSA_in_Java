package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Find_no_of_triangles {
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
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]>arr[k])
                        count++;
                }
            }
        }
        System.out.println("No. of triangles present are: " + count);
    }
}
