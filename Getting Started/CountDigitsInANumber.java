import java.util.*;
public class CountDigitsInANumber {
    public static void main (String[] args) {
        int n , count = 0;
        Scanner scn =  new Scanner(System.in);
        n = scn.nextInt();
        int temp = n;
        while(temp != 0)
        {
            temp  = temp / 10;
            count ++;
        }
        System.out.println(count);
  
    }
}