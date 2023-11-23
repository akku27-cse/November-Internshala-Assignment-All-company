public class Q4_Plaindrome_Number {
    public static void main(String[] args) {
        int n = 451;
        int temp = n;
        int sum=0,rem;
        while (n > 0) {
            rem = n % 10;
            sum = (sum * 10) + rem;
            n /= 10;
        }
        if (temp == sum) {
            System.out.println("this palindrome number");
        } else {
            System.out.println("this is not plindrome Number");
        }
    }
}
