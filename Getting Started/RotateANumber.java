import java.util.*;
public class RotateANumber {
    public static void main(String[] args) {
        // write your code here
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int rem , quo;
        int sum = 0;
        int i = 0;
        int mul = 1 , p = 1;
        int temp = n;
        int temp2 = n , count = 0;
        while(temp2 != 0)
        {
            temp2 = temp2 / 10;
            count ++;
        }
            k = k % count;
        if(k < 0 )
        {
            k = k + count;
        }
        
        while(temp != 0)
        {
            if(i < k)
            {
                mul = mul * 10;
            }
            else
            {
                p = p * 10;
            }
            i ++;
            temp = temp / 10;
        }
        
            quo = n / mul;
            rem = n % mul;
            sum = rem * p + quo;
        System.out.println(sum);
        
      }
}

