public class Function_recursion {
    static void sum0(){
        System.out.println("its func zero");
    }
    static void sum1(int a){
        System.out.println("its func one"+a);
        sum0();
    }
    static int sum2(){
        System.out.println("its func two");
        sum1(1);
        return 0;
    }
    static int sum3(int b){
        System.out.println("its func three");
        sum2();
        return b;
    }
    public static void main(String[] args) {
        sum3(3);
    }       
}
