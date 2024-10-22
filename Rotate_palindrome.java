import java.util.*;
public class Rotate_palindrome {
    static boolean isPalindrome(int n){
        int r=0;
        int temp=n;
        while(n!=0){
            r=r*10+n%10;
            n/=10;
        }
        if(r==temp){
            return true;
        }else
         return false;

    }

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no.");
    int n=sc.nextInt();
    int len=Integer.toString(n).length();
        for(int i=0; i<len-1;i++){
            int leftpart=n/10;
            int rightpart=n%10;
            int rot=rightpart*(int)Math.pow(10,len-1);
            n=leftpart+rot;
        }
        if(isPalindrome(n)){
            System.out.println("rotated palindrome");
            }else
            System.out.println("not rotated palindrome");
            }
    }

