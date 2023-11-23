public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 6, 7 };
        int[] arr2 = { 9, 10, 11, 12, 13, 14 };
        int a1 = arr1.length;
        int b1 = arr2.length;
        int c1=a1+b1;
        int[] c2 = new int[c1];
        for (int i = 0; i < a1; i++) {
            c2[i] = arr1[i];
        }
        for(int i=0;i<b1;i++)
            c2[a1 + i] = arr2[i];
        for (int i = 0; i < c2.length; i++) {
        System.out.println(c2[i]);
      }
    
        }
}
