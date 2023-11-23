/*sum of all odd number */
import java.util.*;
public class PracticeFunctionQuestions2 {

    public static void sumOfAllOddNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                //sum = sum + i;
                sum = sum + i;
            }

        }
System.out.println(sum);
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n = sc.nextInt();
    sumOfAllOddNumber(n);
}    
}
