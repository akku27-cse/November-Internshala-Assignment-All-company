public class CountTheNumberofWords {
    public static void main(String[] args) {
        int count=0;
        String s = "hii this is santu jana";
       // String cgh = "";
     //  int count = 0;
        char ch;
        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }

        }
        System.out.println(count+1);
    }
}
