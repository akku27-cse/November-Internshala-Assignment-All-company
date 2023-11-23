public class BinarySearch {
    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int start = 0, last = arr.length,serach=6;
        int mid = (last + start) / 2;
        while (start <=     last) {
        
        if (serach>arr[mid]) {
            start = mid + 1;

        } else if (arr[mid] == serach) {
                System.out.println("found");
                break;
            }
            else
            last=mid-1;
            mid = (start + last) / 2;
        
       }
    }
}
