public class Plindrome {
    public static void main(String[] args) {
        int sum = 0;
        
        int n = 275;
        int temp = n;
        while (n > 0) {
            int rem = n % 10;
            sum = (sum * 10) + rem;
            n /= 10;
        }
        if (temp == sum) {
            System.out.println("this is palndrome");

        }
          System.out.println("this is not palndrome");       
    }
}
