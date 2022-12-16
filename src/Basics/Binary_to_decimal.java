package Basics;

public class Binary_to_decimal {
    public static void main(String[] args) {
        //Given a Binary Number B, find its decimal equivalent.

        int binary = 10001000;
        int product = 0;
        int i=1;
        while (binary>0){
            int rem = binary%10;
            product = product + (i*rem);
            i=i*2;
            binary/=10;
        }
        System.out.println("Decimal no. is: " + product);
    }
}
