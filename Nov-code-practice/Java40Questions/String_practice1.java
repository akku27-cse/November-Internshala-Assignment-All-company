public class String_practice1 {
    public static void main(String[] args) {
        String s = "hello AND heLLo";
        //to upperCse
        System.out.println(s.toUpperCase());
        //to Lower case
        System.out.println(s.toLowerCase());
        //length of String
        System.out.println(s.length());
        //char at it use to single chracter at particuler index;
        System.out.println(s.charAt(3));
        //StartWith it return onl true or false value 
        System.out.println("start with-" + s.startsWith("hee"));
        
        //replace
        System.out.println(s.replace("AND","OR"));
        //replace al
        System.out.println(s.replaceAll("o", "@"));
        
        //to convert character array
        
        
        char[] ch = s.toCharArray();
        System.out.println("aftter i convert in to a character array");
        for (int i = 0; i < ch.length; i++) {
            System.out.println("character at " + i + "is" + ch[i]);

        }
        
    }
}
