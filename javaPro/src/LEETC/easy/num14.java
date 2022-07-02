package LEETC.easy;

/**
 * @创建人：Administrator
 * @备注：200 先判断是否为空，
 */
public class num14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        int count = strs.length;
        for (int i = 1; i < count; i++){
            prefix = longCommonPrefix(prefix, strs[i]); //覆盖之前的
            if (prefix.length() == 0) break; //直接下次循环
        }
        return prefix;
    }
    public String longCommonPrefix(String s1, String s2){
        int length = 0;
        int n = Math.min(s1.length(), s2.length());
        int index = 0;
        while (index < n && s1.charAt(index)==s2.charAt(index)){
            index++;
        }
        return s1.substring(0,index);
    }

    public static void main(String[] args) {
        String[]  strs = {"flower","flow","flight"} ;
        num14 n = new num14();
        System.out.println(n.longestCommonPrefix(strs));
        System.out.println("1"=="1");
    }
}
