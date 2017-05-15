import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author John Antonio Collins
 * Created on 5/14/17.
 */
public class Solution_Test
{
    Solution solution_Test;

    @Before
    public void setUp()
    {
        solution_Test = new Solution();
    }

    @Test
    public void solve_Test_all_zeros(){
        int[] arr = solution_Test.solve(0, 0, 0, 0, 0, 0);
        String actual = Integer.toString(arr[0]) + " " + Integer.toString(arr[1]);
        String expected = "0 0";
        assertEquals("all equal, no points awarded", expected, actual);
    }

    @Test
    public void solve_Test_all_ones(){
        int[] arr = solution_Test.solve(1, 1, 1, 1, 1, 1);
        String actual = Integer.toString(arr[0]) + " " + Integer.toString(arr[1]);
        String expected = "0 0";
        assertEquals("all equal, no points awarded", expected, actual);
    }

    @Test
    public void solve_Test_Alice_three_to_zero(){
        int[] arr = solution_Test.solve(1, 1, 1, 0, 0, 0);
        String actual = Integer.toString(arr[0]) + " " + Integer.toString(arr[1]);
        String expected = "3 0";
        assertEquals("Alice wins all three points", expected, actual);
    }

    @Test
    public void solve_Test_Bob_three_to_zero(){
        int[] arr = solution_Test.solve(1, 1, 1, 2, 2, 2);
        String actual = Integer.toString(arr[0]) + " " + Integer.toString(arr[1]);
        String expected = "0 3";
        assertEquals("Bob wins all three points", expected, actual);
    }

    @Test
    public void solve_Test_Alice_two_Bob_one(){
        int[] arr = solution_Test.solve(1, 1, 1, 0, 0, 2);
        String actual = Integer.toString(arr[0]) + " " + Integer.toString(arr[1]);
        String expected = "2 1";
        assertEquals("Alice wins 2, Bob wins 1", expected, actual);
    }

    @Test
    public void solve_Test_Alice_one_Bob_two_with_negatives(){
        int[] arr = solution_Test.solve(1, -1, 1, 0, 0, 2);
        String actual = Integer.toString(arr[0]) + " " + Integer.toString(arr[1]);
        String expected = "1 2";
        assertEquals("Alice wins 1, Bob wins 2", expected, actual);
    }
}
