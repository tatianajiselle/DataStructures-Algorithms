class BasicLinkedList {
    Node next = null;
    int data;

    public Node(int d){
        this.data = d;
    }

    // traverse thru the list to get to tail end. add new node
    // 1-> 2-> 3
    // 1-> 2-> 3-> data-> null
    void appendToTail(int data){
        Node newNode = new Node(data);
        Node current = this;

       while(current.next != null){
            current = current.next; 
        }
        current.next = newNode;
    }

    // 1-> 2-> 3
    // 1-> 3
    Node deleteNode(Node head, int data){
        Node current = head;

        // if first node is the one to be removed
        if (head.data == data){
            return head.next;
        }
        // traverse list if the next nodes data is one to remove, remove
        while (current.next != null){
            if (current.next.data == data){
                current.next = current.next.next; 
                return head;
            }
            // if the next nodes data isnt node to remove
            current = current.next;
        }
        return head;
    }

    // 1-> 2-> 3
    Node appendToHead(Node head, int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
        
        return head;
    }
}
