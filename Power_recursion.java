import java.util.*;
public class Power_recursion {
    static Boolean pow(int n){
        if(n%2!=0 && n>1)
        return false;
        else if(n==1)
        return true;
        else
        return true && pow(n/2);

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n=sc.nextInt();
        System.out.println(pow(n));

    }
}
