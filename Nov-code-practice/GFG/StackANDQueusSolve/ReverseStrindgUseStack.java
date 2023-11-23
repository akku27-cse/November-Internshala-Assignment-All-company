import java.util.*;

public class ReverseStrindgUseStack {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter a Sting");
        String s = "utnas";
        //  String s = "Santu";
        Stack<Character> st = new Stack<>();
        //char chars = s  .toCharArray();
        //for(char c:chars)
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }
        while (!st.empty()) {
            System.out.println(st.pop());
        }
    }
}
