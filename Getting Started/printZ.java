import java.util.*;

public class printZ {

    public static void main(String[] args) {
        // Write your code here
        Scanner scn = new Scanner(System.in);
        int sp = 3;
        for(int i = 0; i < 5; i ++)
        {
            
            if(i == 0)
            {
                for(int j = 0; j < 5; j ++)
                {
                    System.out.print("*");
                }
            }
            
        }
        System.out.println();
        for(int i = 1; i < 4; i ++)
        {
            
                for(int j = 0; j < 5; j ++)
                {
                    if(j == sp)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                    
                }
                sp --;
                   System.out.println();
            
            
        }
        for(int i = 4; i < 5; i ++)
        {
            
            if(i == 4)
            {
                for(int j = 0; j < 5; j ++)
                { 
                    System.out.print("*");
                }
            }
            System.out.println();
        }
            
    }
}