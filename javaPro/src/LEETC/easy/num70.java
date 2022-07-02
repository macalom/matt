package LEETC.easy;

/**
 * @创建人：Administrator
 * @备注：动态规划  因为每次只能爬 11 级或 22 级，所以 f(x)f(x) 只能从 f(x - 1)f(x−1) 和 f(x - 2)f(x−2) 转移过来
 */
public class num70 {

    public int climbStairs(int n) {
            int p = 0, q = 0, r = 1;
            for (int i = 1; i <= n; ++i) {
                p = q; //f(x-2)
                q = r; //f(x-1)
                r = p + q;
            }
            return r;
        }

}
