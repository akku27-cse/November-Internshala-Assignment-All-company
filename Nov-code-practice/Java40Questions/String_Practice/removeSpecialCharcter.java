public class removeSpecialCharcter {
    public static void main(String[] args) {
        String s = "nh%^&^78sdffkskdhfAh";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>64&&s.charAt(i)<92||s.charAt(i)>95&&s.charAt(i)<123) {
                result += s.charAt(i);
            }

        }
        System.out.println(result);
    }
}
