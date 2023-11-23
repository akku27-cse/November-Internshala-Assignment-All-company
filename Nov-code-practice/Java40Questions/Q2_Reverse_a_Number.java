public class Q2_Reverse_a_Number {
    public static void main(String[] args) {
        int n = 721;
        int rem, sum = 0;
        while (n > 0) {
            rem = n % 10;
            sum = (sum * 10) + rem;
            n /= 10;

        }
        System.out.println(sum);
        
    }
}
