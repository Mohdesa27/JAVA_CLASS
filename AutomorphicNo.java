import java.util.*;
public class AutomorphicNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int len=Integer.toString(n).length();
        int sq=n*n;
        int div=(int)Math.pow(10, len);
        int r=sq%div;
        System.out.println(r==n);
        sc.close();
    }

}
