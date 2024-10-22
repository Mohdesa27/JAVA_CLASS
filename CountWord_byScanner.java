import java.util.*;
public class CountWord_byScanner {
    public static void main(String[] args) {
        Scanner sc= new Scanner("my   name is raja");
        int c=0;
        while(sc.hasNext()){
            sc.next();
            c++;
        }
        System.out.println(c);
    }
    
}
