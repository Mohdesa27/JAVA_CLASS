
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Output_onPdf{
    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream("D:\\ALLCODE\\FULL STACK\\Notes.pdf"));

            // Now System.out will write to the file instead of the console
            System.out.println("Hello, World!");

            // You don't need to explicitly close System.out as it will be handled automatically
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
