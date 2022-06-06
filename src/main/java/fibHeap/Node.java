package fibHeap;

class Node {
    Node  left, right;
    int element;

    /** Constructor **/
    public Node(int element)
    {
        this.right = this;
        this.left = this;
        this.element = element;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}