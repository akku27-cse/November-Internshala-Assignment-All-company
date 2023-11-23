public class SumofArray {
    public static void main(String[] args) {
        int[] a = { 7, 5, 6, 7 };
        int i,sum=0;
        for (i = 0; i <= a.length-1; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);
          //sum=25
        int rem,s=0;
        while (sum > 0) {
            rem = sum % 10;
            s = s + rem;
            sum = sum / 10;
        }
        System.out.println("sum of two digit"+s);
    }
}
