import java.util.ArrayList;

/**
 * 1
 * 2   3
 * 4  5   6
 */
public class treeSum {
    // Flip this boolean to true to view the traversal of the tree.
    private static boolean debug = false;

    public static void main(String[] args) {
        Node root = initTree();
        int answer = 21;

        int sum = sumTree(root);

        System.out.println(sum == answer);
    }

    private static int sumTree(Node root) {
        int returnInt = root.getValue();
        for (Node node : root.getChildren()) {
            if (debug) {
                boolean hasChildren;
                System.out.println("Node value...............[" + node.getValue() + "]");
                if (node.getChildren().size() > 0) {
                    hasChildren = true;
                } else {
                    hasChildren = false;
                }
                System.out.println("Does node have children..[" + hasChildren +"]");
                System.out.print("\n");
            }
            returnInt = returnInt + sumTree(node);
        }
        return returnInt;
    }

    private static Node initTree() {
        Node root = new Node(1);
        Node left = new Node(2);
        Node right = new Node(3);
        root.addChild(left);
        root.addChild(right);
        left.addChild(new Node(4));
        left.addChild(new Node(5));
        right.addChild(new Node(6));
        return root;
    }
}

class Node {
    private int value;
    private ArrayList<Node> children;

    public Node(int val) {
        value = val;
        children = new ArrayList<Node>();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int val) {   // To make immutable remove this set method since the value is passed into the constructor. - SAW 11-23-14
        value = val;
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public void addChild(Node child) {
        children.add(child);
    }
}
