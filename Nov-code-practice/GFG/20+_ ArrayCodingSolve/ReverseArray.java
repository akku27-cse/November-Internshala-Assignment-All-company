public class ReverseArray {
    public static void main(String[] args) {
        
        int[] arr = { 7, 6, 9, 7, 2 };
        for (int i = arr.length-1; i >= 0; --i) {
            System.out.println(arr[i]);
        }
    }
}
