import java.util.*;
public class LinearSearch{
    public static void main(String[] args) {
        int[] arr = { 7, 9, 22, 7, 8, 9, 11 };
        int n = arr.length, s = 22, tenp=0, i;
        for (i = 0; i < n; i++) {
            if (arr[i] == s) {
                tenp++;
            }
        }
        if (tenp == 1) {
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }
}