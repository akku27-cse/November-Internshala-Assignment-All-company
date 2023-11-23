public class Q10_CheckPimeorNot {
    public static void main(String[] args) {
        int m = 10;
        int n = m / 2;
        int flag=0;
        for (int i = 2; i <= n; i++) {
            if (m % i == 0) {
                flag++;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("this is not prime Number");
        }
        else {
            System.out.println("this is prime Number");
        }
    }
}
