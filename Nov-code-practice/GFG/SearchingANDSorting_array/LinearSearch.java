public class LinearSearch{
    public static void main(String[] args) {
        
        int[] arr={4,1,3,9,7,8,5,1};
        int n = arr.length;
        int count = 0;
        int search=1;
        for (int i = 0; i < n; i++) {
            if (search == arr[i]) {
                count++;
            }

        }
        if (count == 1) {
            System.out.println("elemrnt is found");
        } else {
            System.out.println("element is not found");
        }
    }
}