public class Q14_Extrect_EvenAndOddNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 8, 9 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + "is even");
            }
            else {
                System.out.println(arr[i]+"is odd");
            }
        }
    }
}
