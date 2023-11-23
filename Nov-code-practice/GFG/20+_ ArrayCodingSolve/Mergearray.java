public class Mergearray {
    public static void main(String[] args) {
       /**it is merge two array */ 
        int[] a = { 1, 2, 3 };
        int[] b = { 2, 5, 6 };
        int[] n = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            n[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            n[i + a.length] = b[i];
        }

       
        for (int i = 0; i < n.length - 1; i++) {
            System.out.println(n[i]);
        }
         for (int j = 1; j < n.length; j++) {
            for (int k = 0; k <= n.length-1; k++) {
                if (n[j] < n[k]) {
                    int temp = a[k];
                    n[k] = n[k+1];
                    n[k+1] = temp;

                }
            }
        }
    }
}
