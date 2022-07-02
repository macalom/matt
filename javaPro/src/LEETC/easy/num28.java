package LEETC.easy;

/**
 * @创建人：Administrator
 * @备注：  haystack = "hello", needle = "ll" "aaaaa", needle = "bba"  返回位置
 */
public class num28 {
    public int strStr(String haystack, String needle) {
            int n = haystack.length(), m = needle.length();
            for (int i = 0; i + m <= n; i++) {
                boolean flag = true;
                for (int j = 0; j < m; j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return i;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        String haystack = "", needle = "";
        num28 n = new num28();
        System.out.println(n.strStr(haystack, needle));
    }
}
