public class Q15_Check_EqualityOfTwoArray {
    public static void main(String[] args) {
        
        int[] arr = { 1, 2, 3, 4, 5,9 };
        int[] arr2 = { 5, 4, 3, 2, 1 };
        int temp;
        int count = 0;
        int flag = 0;
        
        
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 1; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length - 1; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    temp = arr2[j + 1];
                    arr2[j + 1] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        if (arr.length != arr2.length)
        {
            System.out.println("this is not Equal");
        }
    //akhne line ta jodi true hoy r nicher line e aste chai na  break lagachhi kinu error
        for (int i = 0; i < arr.length &&     i < arr2.length; i++) {
           
      
            if (arr[i] == arr2[i]) {
                count++;
            } else {
                flag++;
            }
        }
        if (count == 0 || flag==1) {
            System.out.println("this is not ewqal");
        }
        else
        System.out.println("this is equal");
    }
}
