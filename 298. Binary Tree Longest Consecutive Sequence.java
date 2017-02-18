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
    int max=1;
    
    public int longestConsecutive(TreeNode root) {
        if(root==null) return 0;
        rec(root, 1);
        return max;
    }
    
    public void rec(TreeNode n, int i){
        if(n.left!=null){
            if(n.left.val==n.val+1){
                rec(n.left,i+1);
                max=Math.max(max,i+1);
            }
            else rec(n.left,1);
        }
        
        if(n.right!=null){
            if(n.right.val==n.val+1){
                rec(n.right,i+1);
                max=Math.max(max,i+1);
            }
            else rec(n.right,1);
        }
        
    }
}