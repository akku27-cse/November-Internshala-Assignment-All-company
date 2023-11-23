

public class FindChracterOccurences {
    public static void main(String[] args) {
        String s = "hi my name is Santu";
        char find = 'm';
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == find) {
                count++;
            }
        }
System.out.println(find+" is occur   "+count+" time in this String");
    }
}
