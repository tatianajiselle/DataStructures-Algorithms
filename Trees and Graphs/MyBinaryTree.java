import com.sun.org.apache.xalan.internal.xsltc.dom.BitArray;

class MyBinaryTree<T> {
    private static class BinaryTreeNode<T>{
        BinaryTreeNode<String> root = null;
        BinaryTreeNode<String> parent = null;
        
        // child nodes
        BinaryTreeNode<String> left;
        BinaryTreeNode<String> right;
        Integer data;

        // constructor
        public BinaryTreeNode(Integer data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    // finds a node for given value 
    public BinaryTreeNode<T> find(BinaryTreeNode<String> current, Integer data){
        if (current == null){
            return null;
        }

        if (current.data == data){
            return current;
        }

        if (data < current.data){
            current.parent = current;
            return Find(current.left, data);
        }
        current.parent = current;
        return Find(current.right, data);
    }

    // adds a node to the tree thru call to addNodeRecursively()
    public void add(Integer data){
        root = addNodeRecursively(this.root, data);
    }

    // Recursively adds the data to a new node in sorted order
    public BinaryTreeNode<T> addNodeRecursively(BinaryTreeNode<String> current, Integer data){
        BinaryTreeNode newNode = new BinaryTreeNode<String>(data);

        if (current == null){
            current = newNode;
        }

        if (data < current.data){
            current.left = addNodeRecursively(current.left, data);
        } else if (data > current.data){
            curennt.right = addNodeRecursively(current.right, data);
        } else {
            return current;
        }
    }

    // remove a node from the tree 
    // calls Find to retrieve node to re removed and parent node
    public void removeNodeAllCases(BinaryTreeNode<String> current, Integer data){
        
        // retrieve node to be deleted
        BinaryTreeNode<String> node = Find(this.root,data);
        
        if (node == null){ // if node DNE in tree
            System.out.println("Exception: No node with value " + data 
            + " exists to remove.");
        } 
      
        // retrieve parent node
        BinaryTreeNode<String> parent = Find(this.root,node.parent.data);

        // case 1: node being removed has no children 
        if (node.right == null && node.left == null){
            if (node == this.root){
                this.root = null;
            } 
            
            if (parent.right == node){ // is the left child
                parent.right = null;
            } if (parent.left == node){ // is the right child
                parent.left = null;
            }
            break;
        }

        // case 2: node to be deleted has only one child
        else if (node.right == null){ // child is a left node
            if (parent.right == node){ // is the parents right child
                parent.right = node.left; // move nodes child to parents right node
            } if (parent.left == node){ // is the parents left child
                parent.left = node.left; // move nodes child to parents left node
            }
            break;

        } else if (node.left == null){ //child is a right node
            if (parent.right == node){ // is the parents right child
                parent.right = node.right;
            } if (parent.left == node){ // is the parents left child
                parent.left = node.right;
            }
            break;
        }
        // case 3: removed node has two childen -- left most promoted
        else if (node.right != null && node.left != null){
            if (parent.right == node){ // is the parents right child
                parent.right = node.left;
                node.left.right = node.right;
            } if (parent.left == node){ // is the parents left child
                parent.left = node.left;
                node.left.right = node.right;
            }
            break;
        }
    }
}