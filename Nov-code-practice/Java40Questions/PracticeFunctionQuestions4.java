
import java.util.*;
import java.util.Scanner;

public class PracticeFunctionQuestions4 {

    public static int powerCalculate(int x, int n) {
        int sum = 1;    
        for (int i = 1; i <= n; i++) {
            sum = sum * x;

        }
        System.out.println(sum);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
       
        int x = sc.nextInt();
        System.out.println("enter Power");
        int n = sc.nextInt();
        powerCalculate(x, n);
    }
}
