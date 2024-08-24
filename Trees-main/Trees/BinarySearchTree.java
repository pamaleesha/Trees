//Binary Search Tree
class BSTNode {
    int data;
    BSTNode left, right;

    public BSTNode(int item) {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree {
    BSTNode root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // Insert a new key into the BST
    void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to insert a new key in BST
    BSTNode insertRec(BSTNode root, int key) {
        if (root == null) {
            root = new BSTNode(key);
            return root;
        }

        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);

        return root;
    }

    // Search a key in BST
    boolean search(int key) {
        return searchRec(root, key);
    }

    // A recursive function to search a key in BST
    boolean searchRec(BSTNode root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (root.data > key)
            return searchRec(root.left, key);

        return searchRec(root.right, key);
    }

    // Inorder traversal of the BST
    void inorder() {
        inorderRec(root);
    }

    // A recursive function to do inorder traversal of BST
    void inorderRec(BSTNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
}
