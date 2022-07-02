package huawei;
import java.util.*;
/**
 * @创建人：Administrator
 * @备注：
 */
public class Huawei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 节点数k
        int k = Integer.parseInt(sc.nextLine());
        String[] str = sc.nextLine().split(" ");
        // k个节点转发能力数组
        int[][] capacity = new int[k + 1][2];
        int i = 1;
        for (String s : str) {
            String[] str1 = s.split(",");
            // 转发流量容量
            capacity[i][0] = Integer.parseInt(str1[0]);
            // 缓存流量容量
            capacity[i][1] = Integer.parseInt(str1[1]);
            i++;
        }
        // 初始流量
        int n = sc.nextInt();
        // DP状态：dp[i][0]为从i发送的数据包，dp[i][1]为第二次从i发送过来的数据包数量
        int[][] dp = new int[k + 1][2];
        // base case
        dp[0][0] = n;
        dp[0][1] = 0;
        dp[1] = dpFunction(dp[0], capacity[1]);
        int res = Math.min(dp[0][0] + dp[0][1], dp[1][0] + dp[1][1]);
        if (k == 0) {
            System.out.println(n);
        }
        if (k == 1) {
            System.out.println(res);
        }
        else {
            for (int j = 2; j <= k; j++) {
                // 上一个没坏，从上一个节点（j - 1）直接传到当前节点（j），没有故障
                int[] res1 = dpFunction(dp[j - 1], capacity[j]);
                // 上上一个节点（j - 2）传过来，上一个节点（j - 1）出现故障
                int[] res2 = dpFunction(dp[j - 2], capacity[j]);
                // 状态转移，选择值最小的一种传递方案
                dp[j] = res1[0] + res1[1] <= res2[0] + res2[1] ? res1 : res2;
            }
            // 最后一个节点坏掉或者正常情况比较较小值
            res = Math.min(dp[k][0] + dp[k][1], dp[k - 1][0] + dp[k - 1][1]);
            System.out.println(res);
        }
    }
    private static int[] dpFunction(int[] pre, int[] capacity) {
        // 第一次发送的数据包数量，根据节点发送能力判断
        int send1 = Math.min(pre[0], capacity[0]);
        // 第二次发送的数据包数量，比较三者得到最小值结果：
        // ①当前节点发送能力capacity[0]，
        //  如果大于这个，多余的包也丢弃，无用
        // ②当前节点缓存能力和上一个节点缓存数据包数量，capacity[1] + pre[1]，
        //  如果这个最小，说明当前节点缓存容量拉满，并且加上前一个节点的缓存包也没达到当前节点发送容量
        // ③前一个节点发送过来的包总量经当前节点发送后剩余的数据包数量，包括前一个包发送完剩余包数量，前一个节点缓存数量（把初始状态看作第0个节点）
        //  这种情况相比于情况②，说明当前节点的缓存能力没达到极限，所以得通过pre[0] - capacity[0]算出来
        // 逻辑：首先比较当前节点发送能力和前一个节点传过来的数据包数量，如果①小于②，则取①；再拿这个结果和①比较，取较小值
        int send2 = Math.min(pre[0] - capacity[0] + pre[1], capacity[0]);
        send2 = Math.min(send2, capacity[1] + pre[1]);
        return new int[]{send1, send2};
    }
}





