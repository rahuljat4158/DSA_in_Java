package Arrays;

import java.util.Arrays;

public class Remove_duplicate_elements_from_sorted_Array {
    public static void main(String[] args) {

        int[] arr = {1 ,3 ,3,3,4 ,5,5 };
        int[] newarr = new int[arr.length];
        int count = 0, i ,m;
        for(i=1 ,m=0;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                newarr[m++] = arr[i-1];
            }else{
                count++;
            }
        }
        newarr[m++] = arr[i-1];

        for(int j=0;j<arr.length-count;j++){
            System.out.print(newarr[j] + " ");
        }

    }
}
