class MyStack<T> {
    private static class StackNode<T>{
        StackNode<T> next;
        T data;

        public stackNode(T data){
            this.data = data;
        }
    }

    // like a head node, we have a top node.
    private StackNode<T> top;

    // remove the top node on the stack
    public T pop() {
        if (this.top == null){
            System.out.println("Error. Cannot pop -- stack is empty.");
        }

        T item = this.top.data;
        this.top = this.top.next; // set new top of stack
        return item;
    }

    // push a new item onto the top of the stack
    void push(T data) {
        StackNode<T> newNode = new StackNode<>(data);

        newNode.next = this.top;
        this.top = newNode;
    }

    // return item at top of stack
    public T peek(){
        if (this.top == null){
            System.out.println("Error. Cannot peek -- stack is empty.");
        }
        return this.top.data;
    }

    // check if the stack is empty or not
    public isEmpty(){
        return this.top == null;
    }
}
