public class CountWord_inSentance {
    public static void main(String[] args) {
        String st="   my name is   king  ";
        String t=st.trim();
        int n=t.length();
        int c=0;
        for(int i=0;i<n;i++){
            if(t.charAt(i)==' ' && t.charAt(i+1)!=' '){// count the spaces
                c++;
         }
    }
    System.out.println(c+1);
}  
}