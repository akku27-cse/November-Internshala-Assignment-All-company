public class StackP {
    public static void main(String[] args) {
        //push 
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 9;
        arr[4] = 10;
      //  arr[5] = 12;
        int top = -1;
        int value=11;
        if (top == arr.length ) {
            System.out.println("stack OverFlow");
        } else {
            top++;
            arr[top] = value;
            System.out.println("stack push sucess");
        }
        //pop
// public void push(){
        if (top == -1) {
            System.out.println("stack Onderflow");
        } else {
            top--;
            //arr[top] = value;
            System.out.println("stack push sucess");
        }   
//    }

    //POP

    
    }
}