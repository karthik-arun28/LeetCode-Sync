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
    private List<Integer> resList = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root==null) return resList;
        if(root.left!=null){
            inorderTraversal(root.left);
            resList.add(root.val);
        }
        else{
            resList.add(root.val);
        }
        if(root.right!=null){
            inorderTraversal(root.right);
        }
        return resList;
    }
}
