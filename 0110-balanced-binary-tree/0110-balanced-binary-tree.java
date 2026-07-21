class Solution {

    public boolean isBalanced(TreeNode root) {

        if (root == null)
            return true;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        if (Math.abs(left - right) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right))
            return true;

        return false;
    }

    public int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }
}