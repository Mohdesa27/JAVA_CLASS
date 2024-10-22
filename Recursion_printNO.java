public class Recursion_printNO {
    static void printno(int c){
        if(c==0){
            return;
        }
        printno(c-1);
        System.out.println(c);
        
    }
    static void printno_reverse(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printno_reverse(n-1);
        
    }
    public static void main(String[] args) {
        printno(5);
        System.out.println();
        printno_reverse(5);
        
    }
    
}
