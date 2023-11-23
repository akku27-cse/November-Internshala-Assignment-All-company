public class Fibonaccisequence {
    public static void main(String[] args) {
        
        int n = 8;
        int a = 0, b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=n;i++){
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
