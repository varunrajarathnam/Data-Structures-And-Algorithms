import java.util.*;
public class PrimeFactorisationOfANumber {
    public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          int i = 2;
          while(i <= n)
          {
              if(n % i == 0 )
              {
                  System.out.print(i + " ");
                  n = n / i;
              }
              else
              {
                  i ++;
              }
          }
        }
}