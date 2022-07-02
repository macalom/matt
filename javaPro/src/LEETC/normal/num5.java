package LEETC.normal;

/**
 * @创建人：Administrator
 * @备注：动态规划
 */
public class num5 {
    public String longestPalindrome(String s) {
        String ans = "";
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for (int l=0;l<n;++l){
         for (int i=0;i+l<n;++i){
             int j=i+l;
             if (l==0){
                 dp[i][j] = true;
             }else if (l==1){
                 dp[i][j] = (s.charAt(i)==s.charAt(j));
             }else{
                 dp[i][j] = (s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]==true);
             }
             if (dp[i][j]&&ans.length()<l+1){
                 ans = s.substring(i,i+l+1);
             }
         }
        }
        return ans;
    }

    public static void main(String[] args) {
        num5 n5 = new num5();
        System.out.println(n5.longestPalindrome(""));

        System.out.println(-11%10);
    }
}
