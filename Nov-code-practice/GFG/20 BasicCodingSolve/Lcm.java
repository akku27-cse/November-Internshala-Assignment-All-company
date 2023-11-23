public class Lcm {
    public static void main(String[] args) {
        int no1 = 8, no3 = 2, i, gcd, lcm;
        for (i = 1; i <= no1 && i <= no3; ++i) {
            if (no1 % i == 0 && no3 % i == 0)
                gcd = i;
        }
        lcm = (no1 + no3) / gcd;
    }
}
