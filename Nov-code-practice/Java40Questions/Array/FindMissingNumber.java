public class FindMissingNumber {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9 };

        int n = arr.length;
        int sum = ((n) * (n + 1)) / 2;
        int sum2=0;
        int result;
        for (int i = 0; i < arr.length-1; i++) {
            sum2 += arr[i];
        }

        result = sum - sum2 ;
        System.out.println(result);
    }
}