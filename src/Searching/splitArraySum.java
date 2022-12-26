package Searching;

public class splitArraySum {
    public static void main(String[] args) {
        //This is the hard leetcode problem asked in google and other MAANG companies.
        // here let array is given {2,7,5,8,10} since it is not sorted dont think about binary
        //try to understand the question like they asked us to find the minimum of the largest
        //sub array sum. Like this given array can be divided in n times like 5 sub arrays
        //[2],[7],[5],[8],[10] now max is 10 here this is the largest sum it can have
        //now for minimum sub array that is 1 it can have is[2,7,5,8,10] and its sum is 32.
        //now we know that minimum largest sub array sum is between 10 and 32.

        int[] arr = {7,2,5,8,10};
        int m = 2;
        int ans = splitArray(arr,m);
        System.out.println(ans);

    }

    static int splitArray(int[] arr,int m){
        int start=0;
        int end=0;

        for(int i=0;i<arr.length;i++){
            start = Math.max(start,arr[i]);
            end+=arr[i];
        }
        //when start=end loop will break
        while(start<end){
            //find mid which can be our potential ans
            int mid = start+(end-start)/2; // mid is 21
            int sum=0;
            int pieces=1;
            //we are making array like for [7,2,5,8,10]
            for(int num : arr){
                //1st array [7,2,5] < 21  if we add 8 also so it will be greater than mid
                //so form next array when greater start sum from that num - [8,10] less than 21
                //when greater than mid, sub array is increased so pieces will increase.
                if(sum+num>mid){
                    sum=num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
            //when pieces is greater than m - means we should increase the start
            //as potential ans will be larger than start
            if(pieces>m){
                start=mid+1;
            }
            // smaller than m so decrease end. As max sum is larger than potential ans.
            else{
                end=mid;
            }
        }
        //at the end start will be equal to end return any.
        return end;
    }
}
