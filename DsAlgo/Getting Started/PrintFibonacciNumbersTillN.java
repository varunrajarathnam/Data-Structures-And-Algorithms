import java.util.*;
public class PrintFibonacciNumbersTillN {
    public static void main(String[] args) {
        // write your code here
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0 , b = 1 , c =  a + b;
        for(int i = 0; i < n; i ++)
        {
            System.out.println(a);
            a  = b;
            b = c;
            c = a + b;
        }
     }
}
