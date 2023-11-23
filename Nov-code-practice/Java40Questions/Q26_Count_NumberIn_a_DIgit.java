public class Q26_Count_NumberIn_a_DIgit {
    public static void main(String[] args) {
        int n = 643564537;
        int rem;
        int count = 0;
        while (n > 0) {
            count++;
            rem = n % 10;

            n /= 10;

        }
        System.out.println(count);
    }
    

}
