class BinaryTreeTraversals {

    // print the left node then the current node then the right branch
    public void inOrder(BinaryTreeNode<T> node){
        if (node != null){
            inOrder(node.left);
            print(node);
            inOrder(node.right);
        }
    }

    // prints the current node then the currents nodes child nodes
    public void preOrder(BinaryTreeNode<T> node){
        if (node != null){
            print(node);
            inOrder(node.left);
            inOrder(node.right);
        }
    }

    // prints the current node after its child nodes
    public void postOrder(BinaryTreeNode<T> node){
        if (node != null){
            inOrder(node.left);
            inOrder(node.right);
            print(node);
        }
    }

    // aka: visiting the node
    public void print(BinaryTreeNode<T> node){
        System.out.println(node);
    }
}