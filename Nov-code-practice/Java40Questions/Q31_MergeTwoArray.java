public class Q31_MergeTwoArray {
    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3 };
        int[] a2 = { 4, 5, 6 };
        int n1 = a1.length;
        int n2 = a2.length;
        int n = n1+n2;
        int[] c1 = new int[n];
        for (int i = 0; i <n1; i++) {
            c1[i] = a1[i];

        }
        for (int i = 0; i <  a2.length; i++) {
            c1[n1+i] = a2[i];
        }
        for (int i = 0; i < c1.length-1; i++) {
            System.out.println(c1[i]);
        }
    }
}
