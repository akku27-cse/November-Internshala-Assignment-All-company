import java.util.*;
public class DeleteMiddleElement {
    static void solve(Stsck<Integer> s, int count, int size) {
        if (count == size) {
            s.pop();
            return;

        }

        int x = s.pop();
        count = count + 1;

        solve(s, count, size);
        s.push(x);
    }
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= 6; i++) {
            stack.push();

        }
         
    }
}
