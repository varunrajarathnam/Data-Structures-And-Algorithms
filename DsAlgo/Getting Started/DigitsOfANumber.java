import java.util.*;
public class DigitsOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n , temp , nod = 0 ,pow = 1;
        n = scn.nextInt();
        temp = n;
        while(temp >= 10)
        {
            temp = temp / 10;
            pow = pow * 10;
        }
        int r , q;
        while(pow > 0)
        {
          q = n / pow;
          r = n % pow;
          System.out.println(q);
          n = r;
          pow = pow / 10;
        }
        
       }
    
}