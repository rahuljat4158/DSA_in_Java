package Arrays;

public class Find_sorted_subsequence_of_size_3_in_linear_time {
    public static void main(String[] args) {
        //Given an array A of N integers, find any 3 elements in it such that
        // A[i] < A[j] < A[k] and i < j < k.
        // we can find it by using 3 nested for loop for i , j & k. but this will increase
        // time complexity to O(N^3). So i will use efficient method of T.C O(N).
        // we can make auxiliary arrays 1 for smaller elements , another for greater elements.


        //int[] arr = {12, 11, 10, 5, 6, 2, 30};
        int[] arr = {1, 2, 3, 4 };
        int n = arr.length;
        int max=n-1 , min=0 , i;
        int[] smaller = new int[n];
        int[] greater = new int[n];

        smaller[0] = -1;
        for(i=1;i<n;i++){
            if(arr[i]<=arr[min]){
                min = i;
                smaller[i] = -1;
            }
            else{
                smaller[i] = min;
            }
        }

        greater[n-1] = -1;
        for(i=n-2;i>=0;i--){
            if(arr[i]>=arr[max]){
                max = i;
                greater[i] = -1;
            }
            else{
                greater[i] = max;
            }
        }

        //Now find a number which has both greater number on right side
        // and smaller number on left side.

        for(i=0;i<n;i++){
            if(smaller[i]!=-1 && greater[i]!=-1){
                System.out.print(arr[smaller[i]]+","+arr[i]+","+arr[greater[i]]+"  ");
            }
        }
    }
}
