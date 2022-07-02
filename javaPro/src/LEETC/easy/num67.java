package LEETC.easy;

/**
 * @创建人：Administrator
 * @备注：
 */
public class num67 {
    public String addBinary(String a, String b) {
        StringBuffer ans = new StringBuffer();

        int n = Math.max(a.length(), b.length());
        int carry = 0;
        for (int i = 0; i < n; i++){
            carry += i<a.length()? (a.charAt(a.length()-1-i)-'0'):0;
            carry += i<b.length()? (b.charAt(b.length()-1-i)-'0'):0;
            ans.append((char)(carry % 2 + '0'));//强转char
            carry /= 2;
        }
        if (carry == 1){
            ans.append('1');
        }
        ans.reverse();
        return ans.toString();
    }

    public String addBinary1(String a, String b) {
            return Integer.toBinaryString(
                    Integer.parseInt(a, 2) + Integer.parseInt(b, 2)
            );
        } //如果 aa 的位数是 nn，bb 的位数为 mm，这个算法的渐进时间复杂度为 O(n + m)O(n+m)。
          // 但是这里非常简单的实现基于 Python 和 Java 本身的高精度功能

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(Integer.parseInt("10",16)));
        System.out.println((char)('0'+1));
    }

}
