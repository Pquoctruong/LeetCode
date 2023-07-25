package Tree;

public class MyBST {
    public TreeNode mRoot;
    public MyBST(){

    }
    public TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        } else {
            TreeNode temp = root;
            while (true) {
                if (value > temp.val) {
                    if (temp.right == null) {
                        temp.right = new TreeNode(value);
                        break;
                    }
                    else
                        temp = temp.right;
                }
                if (value < temp.val) {
                    if (temp.left == null) {
                        temp.left = new TreeNode(value);
                        break;
                    }
                    else
                        temp = temp.left;
                }
            }
            return root;
        }
    }
}
