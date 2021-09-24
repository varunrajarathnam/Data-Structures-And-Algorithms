import java.util.*;
public class PythagoreanTriplet {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();
        int s1 = n1 * n1;
        int s2 = n2 * n2;
        int s3 = n3 * n3;
        int max = s1;
        if (max < s2) {
            max = s2;
        }
        if (max < s3) {
            max = s3;
        }
        if (max == s1)
        {
            boolean flag = ((s2 + s3) == s1);
            System.out.println(flag);
        }
         if (max == s2)
        {
            boolean flag = ((s1 + s3) == s2);
            System.out.println(flag);
        }
         if (max == s3)
        {
            boolean flag = ((s2 + s1) == s3);
            System.out.println(flag);
        }



    }
}

