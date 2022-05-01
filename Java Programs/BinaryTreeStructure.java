import java.util.*;

public class BinaryTreeStructure {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // Preorder traversal
        public static void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // Inorder traversal
        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }

            inOrder(root.left);
            System.out.print(root.data + " ");
            preOrder(root.right);
        }

        // Postorder traversal
        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }
            preOrder(root.left);
            preOrder(root.right);
            System.out.print(root.data + " ");
        }

        // Level order traversal
        public static void levelOrder(Node root) {

            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node curNode = q.remove();
                if (curNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(curNode.data);
                    if (curNode.left != null) {
                        q.add(curNode.left);
                    }
                    if (curNode.right != null) {
                        q.add(curNode.right);
                    }
                }
            }
        }

        // Total count of Node
        // Time complexity: O(n)
        public static int countNodes(Node root) {
            if (root == null) {
                return 0;
            }

            int countLeft = countNodes(root.left);
            int countRight = countNodes(root.right);
            return countLeft + countRight + 1;
        }

        // O(n)
        public static int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }

            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);

            return leftSum + rightSum + root.data;
        }

        // O(n)
        public static int heightOfTree(Node root) {
            if (root == null) {
                return 0;

            }
            int leftHeight = heightOfTree(root.left);
            int rightHeight = heightOfTree(root.right);

            int height = Math.max(leftHeight, rightHeight) + 1;

            return height;

        }

        // O(n^2)
        public static int diameterOfTree(Node root) {
            if (root == null) {
                return 0;
            }

            int diam1 = diameterOfTree(root.left);
            int diam2 = diameterOfTree(root.right);
            int diam3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

            return Math.max(diam3, Math.max(diam1, diam2));

        }

        // Diamater of Tree (O(n)) approach
        static class TreeInfo {
            int height;
            int diameter;

            public TreeInfo(int height, int diameter) {
                this.height = height;
                this.diameter = diameter;

            }
        }

        public static TreeInfo diameter2(Node root) {
            if (root == null) {
                return new TreeInfo(0, 0);
            }

            TreeInfo left = diameter2(root.left);
            TreeInfo right = diameter2(root.right);

            int myHeight = Math.max(left.height, right.height) + 1;

            int diam1 = left.diameter;
            int diam2 = right.diameter;
            int diam3 = left.height + right.height + 1;

            int mydiam = Math.max(diam3, Math.max(diam1, diam2));

            TreeInfo info = new TreeInfo(myHeight, mydiam);

            return info;

        }

        public static boolean isSubTree(Node root, Node subroot) {

            if (subroot == null) {
                return true;
            }

            if (root == null) {
                return false;
            }

            if (root.data == subroot.data) {
                if (isIdentical(root, subroot)) {
                    return true;
                }
            }

            return isSubTree(root.left, subroot) || isSubTree(root.right, subroot);
        }

        public static boolean isIdentical(Node root, Node subroot) {
            if (root == null && subroot == null) {
                return true;
            }

            if (root == null || subroot == null) {
                return false;
            }

            if (root.data == subroot.data) {
                return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
            }

            return false;

        }

    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        // System.out.println(root.data);
        System.out.println("Preorder is: ");
        tree.preOrder(root);
        System.out.println();
        System.out.println("Inorder is: ");
        tree.inOrder(root);
        System.out.println();
        System.out.println("Postorder is: ");
        tree.postOrder(root);
        System.out.println();
        System.out.println("Level Order traversal is: ");
        tree.levelOrder(root);

        System.out.println();
        int count = tree.countNodes(root);
        System.out.println("The total count of node is: " + count);
        // Linekdin

        System.out.println("The Sum of nodes is: " + tree.sumOfNodes(root));

        System.out.println("The Height of the tree is: " + tree.heightOfTree(root));

        System.out.println("The Diameter of the tree is: " + tree.diameterOfTree(root));

        System.out.println("The diamater of tree (Approach 2) is: " + tree.diameter2(root).diameter);

    }
}