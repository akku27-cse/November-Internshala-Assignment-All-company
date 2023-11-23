
package Stack;
import java.util.*;

public class StackUseingQueue {
    //define  stack 
static class Stack{
    static Queue<Integer> q1 = new LinkedList<Integer>();
    static Queue<Integer> q2 = new LinkedList<Integer>();

    //to maintain current number
    //elements
    static int curr;

    static void push(int x) {
        //enter First Element in empty String

        q2.add(x);
        //push element in q1 t q2
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();

        }
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;

    }

    static void pop() {
        if (q1.isEmpty()) {
            return;
            // q1.remove();
        }
    }

 static int top() {
     if (q1.isEmpty()) {
         return -1;
         return q1.peek();     
     }

    static int size() {
        return q1.size();
    }

}
}

    public static void main(String[] args) {
    // stack implementation
    Stack s = new Stack<>();
    s.push(7);
    s.push(3);
    s.push(9);
    System.out.println("current Size" + s.size());
    s.pop();
    s.pop();
    s.pop();
    System.out.println("Current Size "+s.size());
     
}
}
