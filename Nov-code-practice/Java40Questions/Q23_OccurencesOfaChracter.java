public class Q23_OccurencesOfaChracter {

    public static void main(String[] args) {
        String s = "santujana";
        char search='a';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == search) {
                count++;
            }
        }
        System.out.println(count);
    }
} 