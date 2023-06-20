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
    public int res = 0;

    public void sumOfLeftLeavesHelper(TreeNode l, TreeNode r) { 
        if (l != null) {
            if (l.left == null && l.right == null) {
                res += l.val;
            }

            sumOfLeftLeavesHelper(l.left, l.right);
        }

        if (r != null) {
            sumOfLeftLeavesHelper(r.left, r.right);
        }
    }

    public int sumOfLeftLeaves(TreeNode root) {
        sumOfLeftLeavesHelper(root.left, root.right);

        return res;
    }
}
