public class Q6_Count_NumberOfDigit {
    public static void main(String[] args) {
        
        int n = 9876;
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        System.out.println(count);
    }
}
