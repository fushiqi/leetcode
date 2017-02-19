/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    static ListNode h;
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        
        h=head;
        int len=listLen(head);
        return buildTree(0, len-1);
        
    }
    
    public int listLen(ListNode head){
        //get the length of the linked list
        int len=0;
        ListNode p=head;
        
        while(p!=null){
            len++;
            p=p.next;
        }
        return len;
    }
    
    public TreeNode buildTree(int start, int end){
        //bottom to up method
        if(start>end) return null;
        
        int mid=(start+end)/2;
        
        TreeNode left=buildTree(start, mid-1);
        TreeNode root=new TreeNode(h.val);
        h=h.next;
        TreeNode right=buildTree(mid+1, end);
        
        root.left=left;
        root.right=right;
        
        return root;
        
    }
}