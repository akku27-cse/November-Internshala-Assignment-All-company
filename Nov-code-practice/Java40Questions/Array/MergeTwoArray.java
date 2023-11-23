public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        
        int[] arr2 = { 1, 3, 6, 7 };
        int a1 = arr1.length;
        int b1 = arr2.length;
        int c = a1 + b1;
        int[] c2 = new int[c];


        for (int i = 0; i <a1; i++) {
            c2[i] = arr1[i];
        }
        for (int i = 0; i < b1; i++) {
            c2[a1 + i] = arr2[i];
        }

 for(int i=0;i<c;i++)
     System.out.println(c2[i]);
        
             int i, j, temp;
        int result = 0;
        for (i = 1; i < c2.length; i++) {
            for (j = 0; j < c2.length - 1; j++) {
                if (c2[j] > c2[j + 1]) {
                    temp = c2[j + 1];
                    c2[j + 1] = c2[j];
                    c2[j] = temp;
                }
            }
        }
        System.out.println("after sorting ");
        
 for( i=0;i<c;i++)
     System.out.println(c2[i]);
    }
}
