package LEETC.easy;

public class num21 {
     //1.递归方法
     public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
          if (l1 == null) {
               return l2;
          }
          if (l2 == null) {
               return l1;
          }
          if (l1.val < l2.val) {
               l1.next = mergeTwoLists1(l1.next, l2);
          }
          else {
               l1.next = mergeTwoLists1(l1, l2.next);
          }
          return l1;
     }

     public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
          ListNode preHead = new ListNode(-1);
          ListNode prev = preHead;
          while (l1 != null && l2 != null) {
               if (l1.val < l2.val){
                    prev.next = l1;
                    l1 = l1.next;
               }else{
                    prev.next = l2;
                    l2 = l2.next;
               }
               prev = prev.next;
          }
          prev.next = l1 == null ? l2 : l1;
          return preHead.next;
     }
}
