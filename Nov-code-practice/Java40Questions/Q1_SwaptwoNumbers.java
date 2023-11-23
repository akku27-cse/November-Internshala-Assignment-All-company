class Q1_SwaptwoNumbers{
    public static void main(String[] args) {
        int a = 2, b = 9, c = 6;
        System.out.println("before swap" + "a=" + a + "b=" + b + "c=" + c);
        int temp;
        temp = c;
        c = a;
        a = temp;
        System.out.println("after swap"+"a="+a+"b="+b+"c="+c);
    }
}