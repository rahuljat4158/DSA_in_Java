package Recursion;

public class pattern1Triangle {
    public static void main(String[] args) {
        //* * * *
        //* * *
        //* *
        //*
        int r = 4;
        int c = 0;
        pattern(r,c);

    }
    static void pattern(int row , int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("* ");
            pattern(row,col+1);
        }
        else{
            System.out.println();
            pattern(row-1,0);
        }

    }
}
