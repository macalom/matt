package LEETC.easy;

/**
 * @创建人：Administrator
 * @备注：
 */
public class num58 {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int head = -1, tail =-1;
        for (int i = 0; i < n -1; i++){
            if (s.charAt(i) == ' '&& s.charAt(i+1) !=' '){
                head = i;
            }
            if (s.charAt(i) != ' '&& s.charAt(i+1) ==' '){
                tail = i;
            }
        }
        if (s.charAt(n-1) != ' ') tail = n -1;
        return tail-head;
    }
    public int lengthOfLastWord1(String s) { //从后往前数
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        if (end < 0) return 0;
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') start--;
        return end - start;
    }

    public static void main(String[] args) {
        String s = " hello";
        num58 n = new num58();
        System.out.println(n.lengthOfLastWord(s));

    }
}
