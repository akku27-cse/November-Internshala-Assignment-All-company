/* greater of two */
import java.util.*;

public class PracticeFunctionQuestions3 {
    public static int greaterNumber(int x, int y) {
        if(x>y)
        System.out.println(x+"is greater");
else
    System.out.println(y + "is greater");
return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int x = sc.nextInt();
        System.out.println("Enter Second Number");
        int y = sc.nextInt();
        greaterNumber(x, y);
    }
}
