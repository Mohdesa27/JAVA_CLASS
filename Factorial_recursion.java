import java.util.Scanner;

public class Factorial_recursion {
    static int fact(int f){
        if(f==0)
        return 1;
        else if (f==1)
        return 1;
        else 
        return f*fact(f-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
        
    }
    
}
