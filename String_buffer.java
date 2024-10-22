public class String_buffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("raja");

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" naddaf g are good boy");  
        System.out.println(sb.capacity());
        System.out.println(sb.length()); 
    
        sb.append("study in b.tach");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("now i am writting anything to check the limit of memory allocate by stringbuffer");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    
        sb.append("now i am writting anything to check the limit of memory allocate by stringbuffer");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }

}
