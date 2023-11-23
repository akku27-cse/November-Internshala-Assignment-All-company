public class LinearSearch {
    public static void main(String[] args) {
        
        int[] arr = { 1, 1, 2, 4, 3, 5, 6, 2 };
        int i, j=0, temp = 4,result=0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == temp) {
                j++;
                result = i;
            }
        }
        if(j==1)
        System.out.println("found at position"+result);
        else{
System.out.println("not found");
        }
    }
}
