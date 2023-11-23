public class Q18_LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 9, 3, 4, 6, 0 };
        int search = 9;
       // int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (search == arr[i]) {
                System.out.println("found at position"+i);
                System.out.println(arr[i]);
            }
        }
    }
}
