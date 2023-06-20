import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void maxProfitTest1() {
        int k = 2;
        int[] prices = {2, 4, 1};
        int output = 2;
        Assert.assertEquals(output, new Solution().maxProfit(k, prices));
    }

    @Test
    public void maxProfitTest2() {
        int k = 2;
        int[] prices = {3, 2, 6, 5, 0, 3};
        int output = 7;
        Assert.assertEquals(output, new Solution().maxProfit(k, prices));
    }

}
