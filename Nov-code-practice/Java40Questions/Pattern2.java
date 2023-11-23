public class Pattern2 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = i; j <= i; j++) {
                System.out.println();
            }
            for(int k=1;k<=i;k++ )
            System.out.print("*");
        }
    }
}
