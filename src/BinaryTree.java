public class BinaryTree {

    Node root;

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(5);
        tree.root.left = new Node(3);
        tree.root.right = new Node(7);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(4);

        System.out.println("Pre");
        tree.printPreOrder();
        System.out.println();

        System.out.println("Post");
        tree.printPostOrder();
        System.out.println();

        System.out.println("In");
        tree.printInOrder();
    }

    void printInOrder() {
        printInOrder(root);
    }

    void printPostOrder() {
        printPostOrder(root);
    }

    void printPreOrder() {
        printPreOrder(root);
    }

    void printInOrder(Node root){

        if (root == null) return;

        printInOrder(root.left);

        System.out.print(root.data+" ");

        printInOrder(root.right);
    }

    void printPostOrder(Node root){

        if (root == null) return;

        printPostOrder(root.left);

        printPostOrder(root.right);

        System.out.print(root.data+" ");
    }

    void printPreOrder(Node root){

        if (root == null) return;

        System.out.print(root.data+" ");

        printPreOrder(root.left);

        printPreOrder(root.right);
    }
}
