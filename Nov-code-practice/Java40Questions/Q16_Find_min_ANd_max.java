public class Q16_Find_min_ANd_max {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 9, 1, 4 };
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int min = arr[0];
        //int n = arr.length;

        System.out.println(min);
        for (int i = arr.length-1; i>=0; i--) {
            System.out.println(arr[i]);
            break;
        }
    }
}