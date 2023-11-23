public class PrintK {
    public static void main(String[] args) {
        int rem,count=0;
        int a = 4, b = 2;
        int k = 1;
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;

        }
        System.out.println(result);
        while (result > 0) {
            rem = result % 10;
            count++;
            if (count == k) {
                System.out.println(rem);
            }
            result /= 10;  
        }
    }
}
