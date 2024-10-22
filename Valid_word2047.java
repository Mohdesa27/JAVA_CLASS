import java.util.*;
public class Valid_word2047 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String w=s.trim();
        int n=w.length();
        int c=0;
        for(int i=0;i<n;i++){
            if(w.charAt(i)!=".*\\d.*" && w.CharAt(i)!=".*[!,.].*"){
            if(w.charAt(i) == ' ' && w.charAt(i+1) !=' ')
                c++;
            }
        }
        System.out.println(c+1);
    }
    
}
