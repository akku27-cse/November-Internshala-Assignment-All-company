public class StackP {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int top = -1;
        int value = 6;
        //push operaion
        if (top == arr.length) {
            System.out.println("Stack Over flow");
        } else {
            top++;
            arr[top] = value;
            System.out.println("Stack Push succuess");
        }
        //pop operation
        // if (top == -1) {
        //     System.out.println("stack underflow");

        // } else {
        //     top--;
        //     System.out.println("stack pop successfull");
        // }
        //peak
        if (top == -1) {
            System.out.println("stack under flow");

        }
        else {
            int i;
            for (i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
        
    }
}
