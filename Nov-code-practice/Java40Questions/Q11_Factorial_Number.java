public class Q11_Factorial_Number {
    public static void main(String[] args) {
        int n = 5;
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
