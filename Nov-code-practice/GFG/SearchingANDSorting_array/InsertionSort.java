public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 3 };
        int n = arr.length;
        int temp, i, j;
        for (i = 1; i < n; i++) {
            temp = arr[i];
            j = i - 1;
            while (temp < arr[j] && j >= 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
