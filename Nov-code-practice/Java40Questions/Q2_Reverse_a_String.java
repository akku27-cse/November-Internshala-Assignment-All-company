//import java.util.*;
public class Q2_Reverse_a_String {
    public static void main(String[] args) {
        
        String s = "santu jana";
        char ch;
        char ch1;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            //nstr = ch + nstr;
            System.out.println(ch + " ");
        }
        //revers
        System.out.println("after reverse");
        for (int i = s.length() - 1; i >= 0; i--) {
            ch1 = s.charAt(i);
                
           System.out.println(s.charAt(i) + " ");
        
        }

    
    }
}
