public class BinarySearch {
    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11 };
        int lb, ub, mid, temp=0;
        int search = 5;
        lb = 0;
        ub = arr.length - 1;
        mid = (lb + ub) / 2;
        while (lb <= ub) {
            if (search > arr[mid]) {
                lb = mid + 1;
                mid = (lb + ub) / 2;
            } else if (search == arr[mid]) {
                temp++;
                break;
            } else if (search < arr[mid]) {
                
                mid = (lb + mid) / 2;
            }
        }
        if (temp == 1) {
        System.out.println("number is found");
    } else {
        System.out.println("number is not found");
    }

    }
}
