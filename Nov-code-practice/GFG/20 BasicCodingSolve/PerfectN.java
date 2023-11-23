public class PerfectN {
    public static void main(String[] args) {
        
        int numm = 7;
        int rem, sum = 0;
        for (int i = 1; i <= numm; i++) {
            rem = numm % i;
            if (rem == 0) {
                sum =sum+ i;
            }

        }
        if(sum==numm){
            System.out.println("this is perfct number");
        }
        else{
            System.out.println("this is not perfect number");
        }
    }
}
