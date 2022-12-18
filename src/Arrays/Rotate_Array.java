package Arrays;
import java.util.*;

public class Rotate_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //**********************************************************************
        // Left Shift
        // 1 2 3 4   2 3 4 1     3 4 1 2

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // k is how much times we have to rotate
        int k = sc.nextInt();
        while(k>0){
            for(int i=0;i<n-1;i++){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            k--;
        }
        System.out.println("Left Shifted Array is: ");
        System.out.println(Arrays.toString(arr));

        //******************************************************************************
        // Right Shift
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for(int i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }

        // m is how times you will right shift array
        int m = sc.nextInt();

        while(m>0){
            for(int j=n2-1;j>0;j--){
                int temp = arr2[j];
                arr2[j] = arr2[j-1];
                arr2[j-1] = temp;
            }
            m--;
        }
        System.out.println("Right Shifted Array is: ");
        System.out.println(Arrays.toString(arr2));





    }
}
