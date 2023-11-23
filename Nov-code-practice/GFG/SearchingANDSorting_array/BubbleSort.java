public class BubbleSort {
    public static void main(String[] args) {
        
        int[] arr = { 4, 2, 1, 3 };
        int n = arr.length;
        int temp, i, j;
        for (i = 1; i < n; i++) {
            for (j = 0; j < n - 1; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
