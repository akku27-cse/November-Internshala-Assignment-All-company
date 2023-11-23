public class Q13_SumOfTwoDigitInArray {
    public static void main(String[] args) {
        
        int[] arr = { 4, 5 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
