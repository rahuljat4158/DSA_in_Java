package Arrays;
import java.util.*;

public class Insert_Element {
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
        //element that need to be inserted
        int k = sc.nextInt();

        //make new array of n+1 then add element k to n position in new array
        int[] newarr = new int[n+1];
        for(int i=0;i<n;i++){
            newarr[i] = arr[i];
        }
        newarr[n] = k;

        //now print new array
        for(int j=0;j<n+1;j++){
            System.out.print(newarr[j]+" ");
        }

    }
}
