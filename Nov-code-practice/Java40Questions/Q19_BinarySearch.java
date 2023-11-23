public class Q19_BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int search = 5;
        int first = 0, last = arr.length-1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (search > arr[mid]) {
                first = mid + 1;
            } else if (search == arr[mid]) {
                System.out.println("found");
                break;
            } else
                last = mid - 1;
                mid = (first + last) / 2;
            
        }
    }
}
