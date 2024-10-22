import java.util.*;
public class Singltion {
    static Singltion instance;
    int x;
    private Singltion(int x){
        this.x=x;
    }

    static Singltion createObj(int x){
        if(instance==null){
            instance=new Singltion(x);
        }
        return instance;
    }
    public static void main(String[] args) {
        Singltion obj1=Singltion.createObj(7);
        Singltion obj2=Singltion.createObj(8);
        System.out.println(obj1.x);
        System.out.println(obj2.x);
    }
}
