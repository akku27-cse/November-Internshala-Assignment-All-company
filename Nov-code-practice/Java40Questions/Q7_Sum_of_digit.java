public class Q7_Sum_of_digit {
    public static void main(String[] args) {
        int n = 9898;
        int sum = 0, rem;
        while (n > 0) {
            rem = n % 10;
            sum = sum + rem;
            n /= 10;
        }
        System.out.println("sum of two digit="+sum);
    }
}
