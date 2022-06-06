package fibHeap;

class FibonacciHeap {
    private Node root;
    private int count;

    public FibonacciHeap() {
        root = null;
        count = 0;
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    public void clear()
    {
        root = null;
        count = 0;
    }

    public int insert(int element)
    {
        Node node = new Node(element);
        node.element = element;

        if (root != null)
        {
            node.left = root;
            node.right = root.right;
            root.right = node;
            node.right.left = node;
            if (element < root.element)
                root = node;
        }
        else {
            root = node;
        }
        count++;
        return count;
    }

    public int getCount() {
        return count;
    }

    public Node getRoot() {
        return root;
    }
}