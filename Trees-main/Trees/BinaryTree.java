//Binary Tree
class BinaryTreeNode {
    int data;
    BinaryTreeNode left, right;

    public BinaryTreeNode(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    BinaryTreeNode root;

    // Constructor
    BinaryTree(int key) {
        root = new BinaryTreeNode(key);
    }

    // Default constructor
    BinaryTree() {
        root = null;
    }
}
