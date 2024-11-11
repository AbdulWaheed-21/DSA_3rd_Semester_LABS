
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
public class Binary_Tree {
    public class Node{
        int data;
        Node right,left;
        public Node(int data){
            this.data=data;
            right=left=null;
        }
    }
    public Node root;
    public Binary_Tree(){
        root=null;
    }
    //INSERTION IN TREE METHOD
    public void insertion( int data){
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.left == null) {
                current.left = newNode;
                break;
            } else {
                queue.add(current.left);
            }

            if (current.right == null) {
                current.right = newNode;
                break;
            } else {
                queue.add(current.right);
            }
        }
    }
    //COUNT METHOD FOR COUNT TOTAL NODES IN TREE
    public int count(){
        if (root == null){
            return 0;
        }

        int count = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            count++;

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return count;
    }
   //TRAVERSAL METHOD
    public void levelOrderTraversal() {
        int height = treeHeight(root);
        for (int i = 1; i <= height; i++) {
            printCurrentLevel(root, i);
        }
        System.out.println();
    }
    private int treeHeight(Node node) {
        if (node == null) return 0;
        return 1 + Math.max(treeHeight(node.left), treeHeight(node.right));
    }
    private void printCurrentLevel(Node node, int level) {
        if (node == null) return;
        if (level == 1) System.out.print(node.data + " ");
        else {
            printCurrentLevel(node.left, level - 1);
            printCurrentLevel(node.right, level - 1);
        }
    }
    public void preOrderTraversal(Node node) {
        if (node == null){
            return;
        }

        System.out.print(node.data + " "); // Visit the root
        preOrderTraversal(node.left); // Traverse the left subtree
        preOrderTraversal(node.right); // Traverse the right subtree
    }
    public void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }

        inOrderTraversal(node.left); // Traverse the left subtree
        System.out.print(node.data + " "); // Visit the root
        inOrderTraversal(node.right); // Traverse the right subtree
    }
    public void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }

        postOrderTraversal(node.left); // Traverse the left subtree
        postOrderTraversal(node.right); // Traverse the right subtree
        System.out.print(node.data + " "); // Visit the root
    }
    public static void main(String args[]){
       Binary_Tree tree = new Binary_Tree();
       //for example: 50, 30, 20, 40, 70, 60, 80).
       tree.insertion(50);
       tree.insertion(30);
       tree.insertion(20);
       tree.insertion(40);
       tree.insertion(70);
       tree.insertion(60);
       tree.insertion(80);
       
       
       System.out.println("the count nodes: "+tree.count());
       
       // Traversals
        System.out.print("Level-order Traversal: ");
        tree.levelOrderTraversal();

        System.out.print("Pre-order Traversal: ");
        tree.preOrderTraversal(tree.root);
        System.out.println();

        System.out.print("In-order Traversal: ");
        tree.inOrderTraversal(tree.root);
        System.out.println();

        System.out.print("Post-order Traversal: ");
        tree.postOrderTraversal(tree.root);
        System.out.println();
       
    }          
}
