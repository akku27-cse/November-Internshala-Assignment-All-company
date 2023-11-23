public class Search {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        int s=7,count=0;
        for (int i = 0; i <= a.length-1; i++) {
            if (s == a[i]) {
                System.out.println(a[i]+ "found at poistion" + i);
                break;
            }
        }
    }
}
