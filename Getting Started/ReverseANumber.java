import java.util.*;
public class ReverseANumber {
    public static void main(String[] args) {
        // write your code here  
        Scanner scn = new Scanner(System.in);
        int n;
        n = scn.nextInt();
        int count = 0;
        int temp = n;
        int r ;
        while(temp != 0)
        {
            r = temp % 10;
            temp = temp / 10;
            System.out.println(r);
            
            
        }
       }   
}