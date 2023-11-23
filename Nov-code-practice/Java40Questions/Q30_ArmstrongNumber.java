public class Q30_ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int rem, sum = 0;
        while (n > 0) {
            rem = n % 10;
            sum = sum + (rem * rem * rem);
            n /= 10;

        }
        if (sum == temp) {
            System.out.println("this isarmstrong number");
        } else {
            System.out.println("this is not armstrong number");
        }

    }
}
