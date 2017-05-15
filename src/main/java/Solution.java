/**
 * @Author John Antonio Collins
 * Created on 5/14/17.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2)
    {
        // Complete this function
        //MY CODE START
        //PLAN: int[2], for-loop, skip if equal, comparison, add points.
        int[] solution = {0, 0};
        int[] a = {a0, a1, a2};
        int[] b = {b0, b1, b2};
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] != b[i])
            {
                int aORbPoint = (a[i] > b[i]) ? 0 : 1;
                solution[aORbPoint] += 1;
            }
        }


        return solution;
        //MY CODE END
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }
}
