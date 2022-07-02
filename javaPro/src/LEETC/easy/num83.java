package LEETC.easy;

/**
 * @创建人：Administrator
 * @备注：只有一次循环，考察链表的基本操作
 */
public class num83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode cur = head;
        while(cur.next != null){
            if(cur.val != cur.next.val){
                cur = cur.next;
            }else{
                cur.next = cur.next.next;
            }
        }
        return head;
    }
}
