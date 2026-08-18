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
    private int preIdx = 0;
        Map<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        
        for(int i =0 ; i< preorder.length; i++){
            map.put(inorder[i], i);

        }
        return helper(preorder,0, inorder.length -1 ); }
        private TreeNode helper(int[] preorder, int start, int end){
            if(start> end){
                return null;
            }
            int rootVal= preorder[preIdx++];
            TreeNode root= new TreeNode(rootVal);
            int mid = map.get(rootVal);
            root.left = helper(preorder, start, mid-1);
            root.right= helper(preorder, mid+1, end );
            return root;

        }



        
    }
