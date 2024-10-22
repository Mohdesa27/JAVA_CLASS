import java.util.*;
public class Resouce_Bundle {
    public static void main(String[] args) {
        ResourceBundle rb;
        Locale l;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the language code:");
        System.out.println("Press 1 for English:");
        System.out.println("press 2 for Hindi:");
        System.err.println("Press 3 for Japanese");
        int choice=sc.nextInt();
        
        switch (choice) {
            case 1:
            l = new Locale("en", "US");
                break;
            case 2:
            l=new Locale("hi","IN");
            break;
            case 3:
            l=new Locale("jp","JP");
            break;
            default:
            System.out.println("Invalid choice, defaulting to English.");
            l = new Locale("en", "US");
                break;
        }
        rb = ResourceBundle.getBundle("ResourceBundle", l);
        System.out.println(rb.getString("ASK_NAME"));
            
    }
    
}
