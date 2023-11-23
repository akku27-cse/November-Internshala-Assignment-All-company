public class Fibonsaciss {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 8,d=0;
        System.out.println(a);
        System.out.println(b);
        int n = a + b;
        for (int i = 3  ; i < c; i++) {
            System.out.println(n);
           a=b;
           b=n;
           n = a + b;
        }
    }
}
