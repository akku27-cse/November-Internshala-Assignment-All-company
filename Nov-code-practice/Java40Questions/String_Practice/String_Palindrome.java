public class String_Palindrome {
    public static void main(String[] args) {
        String s = "abbea";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if (s.equals(rev)) {
            System.out.println("it is plaindrome ");
        }
        else
        System.out.println("not palindrome");
    }
}
