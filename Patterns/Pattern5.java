import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int sp = n / 2;
        int st = 1;
        for (int i = 1; i <= n; i ++)
        {
            for(int j = 1; j <= sp; j ++)
            {
                System.out.print("	");
            }
            for(int k = 1; k <= st; k ++)
            {
                System.out.print("*	");
            }
            if(i <= n / 2)
            {
                sp --;
                st += 2;
            }
            else 
            {
                sp ++;
                st -= 2;
            }
            System.out.println();
        }
        
    } 
}
