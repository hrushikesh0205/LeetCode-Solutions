class Solution {
    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
    diameter=0;
    dfs(root);
    return diameter;
        
    }

    private int dfs(TreeNode node)
    {
        if(node==null)
        {
            return 0;
        }
        int leftpath=dfs(node.left);
        int rightpath=dfs(node.right);
        diameter=Math.max(diameter,leftpath+rightpath);
        return 1 + Math.max(leftpath,rightpath);
    }
}