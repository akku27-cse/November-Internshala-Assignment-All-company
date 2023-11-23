// public class FindNonreaptingChar {
//     public static void main(String[] args) {
//         char[] s = "hello".toCharArray();
//         String ans = " ";
//         int i, j;
//         for (i = 0; i < s.length; i++) {
//             for (j = 1; j < s.length; j++) {
//                 if (s[i] != s[j]) {
//                     ans += s[j];
//                 }

//                 break;
//             }
//            // ans = s[i];
            
//         }
//        System.out.println("non reaptig character is" + ans);
//     }

// }

import java.util.regex.Pattern;

public class FindNonreaptingChar {

    public static void main(String[] args) {
        String s = "hii my name is santu";
        String p = Pattern.compile("\s");
        String[] temp = p.split(s);
    }
}