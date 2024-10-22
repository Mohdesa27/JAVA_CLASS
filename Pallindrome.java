public class Pallindrome {
    public static void main(String[] args) {
        String s="";
       String s1="racecar";
       
       for(int i=s1.length()-1;i>=0;i--){
        // S=(String) S+;
        s=s+s1.charAt(i);
        System.out.println(s);
       }
       if(s1.equals(s)){
       System.out.println("pallindrome");
       }
       else
       System.out.println("not pallindrome");
    }
    
}
