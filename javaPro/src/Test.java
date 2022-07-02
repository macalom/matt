import java.util.HashMap;
import java.util.Map;

/**
 * @创建人：Administrator
 * @备注：
 */
public class Test {
    public int age;
    public static int count;
    public String s;
    public Test(int age, int count, String s) {
        age++;
        count++;
        System.out.println("age"+age+"count"+count);
        s="a";
    }
    void Test(int age,int count,String s){
        age++;
        count++;
        s="a";
        System.out.println("age"+age+"count"+count+s);

    }

    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        boolean c = false;
        Map<Character,Integer> occ = new HashMap<Character,Integer>();
        for(int i=0;i<n1;i++){
            if(!occ.containsKey(s1.charAt(i))){
                occ.put(s1.charAt(i),1);
            }else{
                occ.put(s1.charAt(i),occ.get(s1.charAt(i))+1);
            }

        }
        for(int i=0;i<n2;i++){
            if(!occ.containsKey(s2.charAt(i))){
               continue;
            }

        }
        return c;
    }

    public String longestCommonPrefix(String[] strs) {
        int minLen = 0;
        for(String a :strs){
            minLen = Math.min(minLen,a.length());
        }
        String s = "";
        for(int i=0;i<minLen;i++){
            char c = strs[0].charAt(i);
            for(String str :strs){
                if(str.charAt(i)!=c) return s;
            }
            s = s+c;
        }
        return s;
    }

    public static void main(String[] args) {
        String a = "aa";
        String b = "aa";
        System.out.println(a==b);
        Test t = new Test(18,2,"B");
        t.Test(18,2,"B");
        String s="1,";
        String[] s1 = s.split(",");
        System.out.println(s1.length);
        for (String s2 : s1) {
            System.out.println(s2);
        }

    }
}
