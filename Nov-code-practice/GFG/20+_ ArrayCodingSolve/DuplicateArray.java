public class DuplicateArray {
    
    public static void main(String[] args) {
        int count = 0;
        int[] arr = { 1, 2,  4,2,3,3};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j =i+ 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                     if(count==1)
                    {
                        break;
                    }  
                   // int idex = j;
                    System.out.println(arr[i]);
                  //  System.out.println(j);
                   
                }
            }

        }

    }
}
