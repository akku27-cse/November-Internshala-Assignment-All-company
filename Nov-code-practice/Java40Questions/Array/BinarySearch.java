public class BinarySearch {
    public static void main(String[] args) {
         int[] arr = { 1, 1, 2, 4, 3, 5, 6, 2 };
         int first=0,last=arr.length;
         int mid=(first+last)/2;
         int search=6;
        
         //for (i = 0; i < arr.length; i++)
         while (first <= last) {
             if (arr[mid] < search) {
                 first = mid + 1;
             } else if (arr[mid] == search) {
                 System.out.println("found");
                 break;
            }else
                last = mid - 1;
            mid = (first + last) / 2;
        } 
    }
}
