import java.util.Arrays;
public class Anagram_problem {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toLowerCase().toCharArray();
        char[] tChars = t.toLowerCase().toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);
    }

    public static void main(String[] args) {
        Anagram_problem a = new Anagram_problem();
        System.out.println(a.isAnagram("Heart","earth"));

}
}