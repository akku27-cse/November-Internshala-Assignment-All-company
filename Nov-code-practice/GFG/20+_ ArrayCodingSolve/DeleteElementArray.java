public class DeleteElementArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7 };
        int remove = 7;
        int index;
        for (int i = 0; i < arr.length; i++) {
            if (remove == arr[i]) {
                index = i;

            }
              for (  int j = index; j < arr.length-1; j++) {
            arr[i] = arr[i + 1];
            
        }
        }
      
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
