/*create a function to calculate the avg of three number */ 
import java.util.*;
public class PracticeFunctionQuestions1 {
    static int avgOfThreeNumbers(int x, int y, int z) {
        int avg = (x + y + z) / 3;
        //System.out.println(avg);
        return avg;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
     int avg= avgOfThreeNumbers(x,y,z);//function call
     System.out.println(avg);
    }
}
