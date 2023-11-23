public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
int s=8  ,temp=0;
        int first = 0, last = arr.length - 1, mid;
        mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] > s) {
                last = mid - 1;
                mid = (first + last) / 2;
            } else if (arr[mid] == s) {
                System.out.println("found");
                temp++;
                break;
            } else {
                first = mid + 1;
                mid = (first + last) / 2;
            }

        }
        if (temp == 0) {
            System.out.println("not found");
        }
    }
}
