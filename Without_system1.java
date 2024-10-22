import java.io.PrintStream;

public class Without_system1 {
    public static void main(String[] args) {
        PrintStream out =new PrintStream(System.out);
        System.setOut(out);

        
        out.println("Hello, World!");
}
}
