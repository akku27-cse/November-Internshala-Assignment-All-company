public class MinAndMAxElement{
    public static void main(String[] args) {
        
        int[] arr = { 3, 5, 69, 1, 2, 3, 89, 7, 9, 8, 788, -9, 8 };
        int n = arr.length;
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("" + max);
        System.out.println(min);
    }
}