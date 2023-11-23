//package String_Practice;

public class RemoveMultipleInAString {
  public static void main(String[] args) {
      char[] s = "hii my name is santu jana".toCharArray();
      String ans = " ";
      int i, j;
      for (i = 00; i < s.length; i++) {
          for (j = 0; j < i; j++) {
              if (s[i] == s[j]) {
                  break;
              }
          }
          if (j == i) {
              ans += s[i];
          }
      }
System.out.println("after remoe duplicate char"+ans);
  }  
}
