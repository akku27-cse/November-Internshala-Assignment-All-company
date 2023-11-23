public class Q33_Remove_vowels_in_String {
    public static void main(String[] args) {
        String s = "please god amk akta job dao";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                continue;
            }else{
                System.out.print(s.charAt(i));
            }
        }
    }
}
