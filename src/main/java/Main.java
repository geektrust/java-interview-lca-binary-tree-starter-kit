package main.java;
public class Main {
    /* Implement your solution inside this method. */
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return null;
    }
    
     /*
     * *****************************************************************************
     * DO NOT EDIT THIS CODE.
     * *****************************************************************************
     * 
     * This code is used to bootstrap your solution to be checked for correctness by
     * our system.
     */
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
}
