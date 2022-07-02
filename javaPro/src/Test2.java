/**
 * @创建人：Administrator
 * @备注：
 */
import java.util.*;
public class Test2 {
//    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        Deque<Integer> path = new ArrayDeque();
//        dfs(nums,path,result,0);
//        return result;
//
//    }
//    public void dfs(int[] nums,Deque path,List<List<Integer>> result,int start){
//
//        if(start==nums.length||path.contains(nums[start])){
//            result.add(new ArrayList<Integer>(path));
//            return;
//        }
//        for(int i=0;i<nums.length;i++){
//            path.addLast(nums[i]);
//            dfs(nums,path,result,start+1);
//            path.removeLast();
//        }
//        return;
//
//    }
//
//    public int[] reversePrint(ListNode head) {
//        if(head==null){
//            return null;
//        }
//        ListNode st = head;
//        int count =0;
//        Deque<Integer> dq = new ArrayDeque<Integer>();
//        while(st!=null){
//            dq.add(st.val);
//            count++;
//            st = st.next;
//        }
//        int[] res = new int[count];
//        for (int i=0;i<count;i++) {
//            res[i] = dq.removeFirst();
//        }
//        return res;
//    }

    public static void main(String[] args) {
//        Map<Integer,List<String>> map = new HashMap<Integer,List<String>>();
//        List<String> list = new ArrayList<>();
//        list.add("123");
//        list.add("122");
//        list.add("1233");
//        map.put(12,list);
//        map.put(123,list);
//        int[] a = new int[]{1,2,3};
//        System.out.println(list);
//        System.out.println(map.values());
//        System.out.println(map.get(12));
        Test2 t = new Test2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] grades = new int[n];
        for(int i = 0;i<n;i++){
            grades[i] = sc.nextInt();
            System.out.println(grades[i]);
        }

        for(int i = 0;i<n;i++){
            int res = 0;
            int pos=i+1;
            //System.out.println(2222);
            while(pos<n){
                if (grades[pos]>grades[i]){
                    res=pos-i;
                    break;
                }
                pos++;
            }
            System.out.println(res);
        }
        //System.out.println(0);
    }
}

