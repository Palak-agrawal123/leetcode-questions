/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null || subRoot==null){
            return root==subRoot;
        }
        if(root.val==subRoot.val && isidentical(root,subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
    public boolean isidentical(TreeNode p,TreeNode q){
        if(p==null || q==null){
            return p==q;
        }
        boolean left=isidentical(p.left,q.left);
        boolean right=isidentical(p.right,q.right);
        return left && right && p.val==q.val;
    }
}