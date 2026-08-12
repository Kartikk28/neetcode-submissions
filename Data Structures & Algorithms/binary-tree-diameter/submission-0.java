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
    public int diameterOfBinaryTree(TreeNode root) {
        if (root==null) return 0;
        int lefth= height(root.left);
        int righth=height(root.right);
        int sum= lefth+righth;
        int sub= Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));
        return Math.max(sum, sub);}
        
    public int height(TreeNode root){
        if(root == null) return 0;
        return 1+ Math.max(height(root.left), height(root.right));
    }
}
