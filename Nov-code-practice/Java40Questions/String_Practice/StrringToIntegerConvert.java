public class StrringToIntegerConvert {
    public static void main(String[] args) {
 
        String s = "200";
        int i = Integer.parseInt(s);
        System.out.println(i);
        int b = 900;
        int c = b + i;
        System.out.println("after converting the String and plus with another integer"+c);
    }
}