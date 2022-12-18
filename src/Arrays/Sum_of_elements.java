package Arrays;

import java.util.Scanner;

public class Sum_of_elements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum=0;
        int[] arr = new int[n];

        //take element as input than add that element to the sum
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Sum of all elements is: " + sum);
    }
}
