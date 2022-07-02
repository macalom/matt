import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.reflect.generics.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;


class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(n<3) return ans;
        for (int i =0;i<n-2;i++){
            int l=i+1,r=n-1;
            while (l<r){
                if ((nums[i]+nums[l]+nums[r])<0){
                    l++;
                }else if ((nums[i]+nums[l]+nums[r])==0){
                    r--;
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    ans.add(list);
                }else{
                    r--;
                }
            }
        }
        return ans;
    }
    public int[] sortedSquares(int[] nums) {

        for(int i=0;i<nums.length;i++){
            nums[i] =  nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
    //test
    public String removeDuplicates(String S) {
        Deque<Character> deque = new LinkedList<Character>();

        char ch;
        for (int i = 0; i < S.length(); i++) {
            ch = S.charAt(i);
            if (deque.isEmpty() || deque.peek() != ch) {
                deque.push(ch);
            } else {
                deque.pop();
            }
        }
        String str = "";
        //剩余的元素即为不重复的元素
        while (!deque.isEmpty()) {
            str = deque.pop() + str;
        }
        return str;
    }


    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];
        ArrayList<Integer> list = new ArrayList<Integer>();
        Deque<TreeNode> dq = new LinkedList<TreeNode>();
        dq.add(root);
        while(!dq.isEmpty()){
            TreeNode tn = dq.pop();
            list.add(tn.val);
            if(tn.left!=null){
                dq.add(tn.left);
            }
            if(tn.right!=null){
                dq.add(tn.right);
            }

        }
        int [] res = new int[list.size()];
        for(int i =0;i< dq.size();i++) {
            res[i] = list.get(i);
        }
        return res;
    }


    public static void main(String[] args) {
//        int[] nums = new Solution().sortedSquares(new int[]{-7, -3, 2, 3, 11});
//        for (int num : nums) {
//            System.out.println(num);
//        }
        Deque<Integer> deque1 = new ArrayDeque<Integer>();
        deque1.push(1);
        deque1.push(2);

        deque1.push(4);
        while(!deque1.isEmpty()){
            System.out.println(deque1.removeLast());
        }
        System.out.println(new Solution().removeDuplicates("abbaca"));

    }
}

