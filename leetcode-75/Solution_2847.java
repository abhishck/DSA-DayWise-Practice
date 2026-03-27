import java.util.Stack;

public class Solution_2847 {
    // public ListNode removeNodes(ListNode head) {
    //     Stack<Integer> st = new Stack<>();
    //     ListNode temp = head;
    //     st.push(temp.val);
    //     temp = temp.next;
    //     while (temp != null) {
    //         while (!st.empty() && st.peek() < temp.val) {
    //             st.pop();
    //         }
    //         st.push(temp.val);
    //         temp = temp.next;
    //     }
    //     ListNode dummy = new ListNode(0);
    //     ListNode prev = dummy;
    //     for (int i : st) {
    //         ListNode node = new ListNode(i);
    //         prev.next = node;
    //         prev = node;
    //     }
    //     return dummy.next;
    // }

}
