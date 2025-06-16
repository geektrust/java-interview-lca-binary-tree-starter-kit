public class Main {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.err.println("Usage: java Main \"[3,5,1,6,2,0,8,null,null,7,4]\" 5 1");
            return;
        }

        String treeListStr = args[0];
        int pVal = Integer.parseInt(args[1]);
        int qVal = Integer.parseInt(args[2]);

        Integer[] treeValues = TreeUtils.parseInputArray(treeListStr);
        TreeNode root = TreeUtils.buildTree(treeValues);
        TreeNode p = TreeUtils.findNode(root, pVal);
        TreeNode q = TreeUtils.findNode(root, qVal);

        TreeNode lca = lowestCommonAncestor(root, p, q);
        System.out.println(lca != null ? lca.val : "null");
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) return root;
        return left != null ? left : right;
    }
}
