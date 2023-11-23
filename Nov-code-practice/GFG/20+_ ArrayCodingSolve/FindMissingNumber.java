public class FindMissingNumber {
    
    public static void main(String[] args) {
    
        int[] arr = { 1, 2, 3,4, 5, 7 };
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i <arr.length; i++) {
            sum1 = sum1 + arr[i];

        }
        for (int i = 1; i <= 7; i++) {
            sum2 = sum2 +i;
        }
        System.out.println(sum2-sum1);
}

}
