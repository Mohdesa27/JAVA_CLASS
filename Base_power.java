import java.util.*;
public class Base_power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base:");
        int b= sc.nextInt();
        System.out.print("Enter the power");
        int p=sc.nextInt();
        int k=1;
        int i;
        for(i=0;i<p;i++){
            k=k*b;
        }
            System.out.println(k);
    }
}
