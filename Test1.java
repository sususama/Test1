package edua;

import java.util.ArrayList;
public class Test1 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public class Solution {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) { //listNode为一个结点
            ListNode temp=listNode;
            Solution solution=new Solution();
            if (temp!=null){ //为空代表最后一个结点
                temp=listNode.next;
                solution. printListFromTailToHead(temp);//递归找到最后一个结点
                arrayList.add(temp.val);
            }
            return arrayList;
        }
    }
}
