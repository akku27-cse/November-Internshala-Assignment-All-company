public class ReverseAnArray {
    public static void main(String[] args) {

        int[] arr = { 1, 1, 2, 4, 3, 5, 6, 2 };
        int i, j, temp;
        for (i = 1; i < arr.length; i++) {
            for (j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
         System.out.println("After sorting array");
        for (i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        System.out.println("After reverse ");
            for (i = arr.length-1; i >= 0; i--)
            System.out.println(arr[i]);

    }
}
