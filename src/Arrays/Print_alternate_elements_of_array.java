package Arrays;

import java.util.Scanner;

public class Print_alternate_elements_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int j=0;j<n;j++){
            if(j%2==0){
                System.out.print(arr[j]+" ");
            }
            else{
                continue;
            }
        }
    }
}
