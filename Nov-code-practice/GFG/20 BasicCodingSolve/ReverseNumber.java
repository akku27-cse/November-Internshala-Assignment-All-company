public class ReverseNumber {
    
    public static void main(String[] args) {
    int sum=0
    ;        int n = 275;
    while (n > 0) {
        int rem = n % 10;
        sum = (sum * 10) + rem;
        n /= 10;
    }
        System.out.println(sum);
}
}
