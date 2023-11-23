public class Selectionsort {
    public static void main(String[] args) {
        
        int[] arr = { 4, 3, 2, 1 };
        int n = arr.length;
        //1st loop
        int pos,temp;
        for (int i = 0; i < n - 1; i++) {
            pos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[pos] > arr[j]) {
                    pos = j;
                }
            }
                temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;

            

        }
        //acending order

        for (int i = 0; i < n; i++) {
            System.out.println("accending oreder"+arr[i]);
        }
        //decending
        for (int i = n-1; i>=0; --i) {
            System.out.println("decending order"+arr[i]);
        }
    }
}
