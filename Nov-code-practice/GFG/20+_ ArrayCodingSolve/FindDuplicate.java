public class FindDuplicate {
    public static void main(String[] args) {
        int value;
        int[] arr = { 1, 2,2, 3, 4, 5, 5 };
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] == arr[j]) {
                    value = arr[j];
                    System.out.println(value);
            
                }   
              //  System.out.println(value);
            }
            
        }

    }
}
