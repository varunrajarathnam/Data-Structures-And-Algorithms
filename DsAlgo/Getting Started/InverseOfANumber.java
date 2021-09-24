import java.util.*;
import static java.lang.Math.pow;
public class InverseOfANumber {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rem , quo,  sum = 0 , count = 0;
        int i = 1;
        while( n > 0)
        {
            rem = n % 10;
            quo = n / 10;
            int mul = (int)Math.pow(10, rem - 1);
            sum =  sum + i * mul;
            n = n / 10;
            i ++;
        }
        System.out.println(sum);
      }
}