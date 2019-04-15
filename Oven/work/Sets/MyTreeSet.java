public class MyTreeSet {

    private class BSTNode {

        private int data;
        private BSTNode left;
        private BSTNode right;


    }

    public static BSTNode search(BSTNode root, int key) {

        BSTNode temp = root;

        while (temp != null) {

            if (key == temp.data) {
                return temp;
            }
            else if (key < temp.data) {
                temp = temp.left;
            }
            else {
                temp = temp.right;
            }
        }
        return temp;
    }

    public static BSTNode searchRecursive (BSTNode root, int key) {

        if (root == null) {
            return null;
        }

        if (key == root.data) {
            return root;
        }
        else if (key < root.data) {
            return searchRecursive(root.left, key);
        }
        else {
            return searchRecursive(root.right, key);
        }
    }




}
