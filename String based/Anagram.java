
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "deven";
        String s2 = "endev";
       

        char[] ss1 = s1.toCharArray();
        char[] ss2 = s2.toCharArray();

        Arrays.sort(ss1);
        Arrays.sort(ss2);

         boolean result = Arrays.equals(ss1, ss2);
        
        System.out.println(result);

    }
}
