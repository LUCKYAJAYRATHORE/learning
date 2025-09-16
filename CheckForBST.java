class CheckForBST
{

    boolean checkBST(Node1 node, int min, int max) {
        if (node == null)
            return true;

        //returning false if this node violates the min/max constraint.
        if (node.data < min || node.data > max)
            return false;

        //otherwise checking the subtrees recursively.
        //tightening the min or max constraint.
        return (checkBST(node.left, min, node.data-1) &&
                checkBST(node.right, node.data+1, max));
    }

    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node1 root)
    {
        // code here.
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }
    public static void main(String[] args) {
       Node1 root = new Node1(20);
root.left = new Node1(10);
root.right = new Node1(30);
root.left.left = new Node1(5);
root.left.right = new Node1(15);

        System.out.println("Root: " + root.data);
        System.out.println("Left Child of Root: " + root.left.data);
        System.out.println("Right Child of Root: " + root.right.data);
        CheckForBST bst = new CheckForBST();
        System.out.println(bst.isBST(root));
}
}


class Node1 {
    int data;
    Node1 left, right;

    Node1(int value) {
        data = value;
        left = right = null;
    }
}