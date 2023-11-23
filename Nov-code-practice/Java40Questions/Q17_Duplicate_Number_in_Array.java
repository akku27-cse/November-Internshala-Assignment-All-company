public class Q17_Duplicate_Number_in_Array {
    public static void main(String[] args) {
        int[] arr = { 2,2, 6, 9, 1,1, 4 };
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("before operation Duplicate number" + arr[i]);

        }
        for (int i = 0; i < arr.length-1; i++) {
           // System.out.println("before operation Duplicate number" + arr[i]);
            if (arr[i] == arr[i + 1]) {
                System.out.println("duplicate number is"+arr[i]);
            }
        }
        

    }
}
