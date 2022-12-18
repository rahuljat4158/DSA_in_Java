package Arrays;
import java.util.*;

public class Find_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        //for taking input in array
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int j;
        for(j=0;j<n;j++){
            if(arr[j]==k){
                System.out.println("Yes element is present at index: " +j);
                break;
            }
        }
        if(j>=n){
            System.out.println("No element is not present in array");
        }
    }
}
