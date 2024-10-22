import java.util.Scanner;

public class Rotation{
    public static int rotateNumber(int n, int r, int len) {
        if (r== 0) {
            return n;
        }


        int div= (int) Math.pow(10, len- 1);
        
    
        int leftDigit = n/ div;       
        int remaining = n% div;       

        int newNo = remaining * 10 + leftDigit;

       return rotateNumber(newNo, r - 1, len);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter the number of rotations: ");
        int r= sc.nextInt();

       int len= Integer.toString(n).length();


        r= r% len;

     int result = rotateNumber(n, r, len);


        System.out.println("Rotated number: " + result);
    }
}