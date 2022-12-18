package Arrays;

import java.util.*;

public class Delete_Array {
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
        //index at which element is going to be removed
        int k = sc.nextInt();

        //initialize new array
        int[] newarr = new int[n-1];
        for(int j=0,m=0;j<n;j++){
            if(j==k){
                continue;
            }
            else{
                newarr[m++]=arr[j];
            }
        }
        //print new array
        for(int i=0;i<n-1;i++){
            System.out.print(newarr[i]+" ");
        }

        /* You can also use this to print array
        System.out.println("Resultant Array: " + Arrays.toString(newarr));
         */

    }
}
