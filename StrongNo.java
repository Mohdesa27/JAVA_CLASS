import java.util.*;
public class StrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        int temp=n;
        while(n>0){//1!+4!+5!=145
            int r=n%10;
            int f=1;
            for(int i=1;i<=r;i++){
                f=f*i;
            }
            s=s+f;
            n=n/10;
        }
        if(temp==s)
        System.out.println("Strong no");//145,40585
        else{
            System.out.println("Not a strong no");
        }
    }

    
}
