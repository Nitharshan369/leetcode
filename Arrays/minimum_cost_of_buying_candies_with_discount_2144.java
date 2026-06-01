import java.util.Arrays;

class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int res = 0;
        int n = cost.length;
        for (int i = 0; i < n; ++i) {
            if (i % 3 != 2) {
                res += cost[n - 1 - i];
            }
        }
        return res;
    }
}