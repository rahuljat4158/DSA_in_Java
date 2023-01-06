package Recursion;

public class countZeros {
    public static void main(String[] args) {
        int n = 12030509;
        System.out.println(countZ(n));

    }
    static int countZ(int n){
        return helper(n,0);
    }

    static int helper(int n,int count){
        if(n==0){
            return count;
        }
        int rem = n%10;
        if(rem==0){
            return helper(n/10,count+1);
        }
        return helper(n/10,count);
    }
}
