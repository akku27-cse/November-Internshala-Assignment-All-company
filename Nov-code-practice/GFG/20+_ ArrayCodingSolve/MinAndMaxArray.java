public class MinAndMaxArray {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 7, 1, 5 };
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int min = arr[0];
        int max = arr[4];
        System.out.println(min);
        System.out.println(max);
        //System.out.println();
        for (int i = 0; i < arr.length;i++)
        System.out.println(arr[i]);
    }
}
