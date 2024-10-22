import java.util.Scanner;
public class armstone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.:");
        int n=sc.nextInt();
        int r,s=0;
        int temp=n;
        int c=0;
        int num=n;
        while(num>0){
          c+=1;
          num/=10;
        }
        while(n>0){
        r=n%10;
        int cd=1;
        for(int i=0;i<c;i++)
        cd*=r;
        s=s+cd;
        n=n/10;
        }
        if(s==temp)
        System.err.println("armstrong");
        else
        System.out.println("not armstong");

    }

    
}
