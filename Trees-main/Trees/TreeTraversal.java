public class TreeTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        TreeTraversal tree = new TreeTraversal();

        System.out.println("Preorder traversal:");
        tree.preorder(root);

        System.out.println("\nInorder traversal:");
        tree.inorder(root);

        System.out.println("\nPostorder traversal:");
        tree.postorder(root);

        System.out.println("\nLevel Order traversal:");
        tree.levelOrder(root);
    }

    // Tree traversal methods (preorder, inorder, postorder, levelOrder) here...
}
