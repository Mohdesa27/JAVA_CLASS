import java.util.Scanner;

public class HollowSqure_rec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n, n);

    }
    public static void star(int n)
    {
        if(n==0)
        return;
        System.out.print("*");
        star(n-1);
    }
    public static void  space(int n)
    {
        if(n==0)
        return;
        System.out.print(" ");
        space(n-1);
    }
    public static void pattern(int rows,int column)
    {
        if(rows==0)
        return;
        if(rows%column==0 || rows%column==(1))
        star(column);
        else{
            star(1);
            space(column-2);
            star(1);
        }
        System.out.println();
        pattern(rows-1, column);

    }
    
}
}
