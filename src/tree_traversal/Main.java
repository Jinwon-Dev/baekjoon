package tree_traversal;

import java.io.*;

class Node {

    char data;
    Node left, right;

    public Node(char data) {
        this.data = data;
    }
}

class Tree {

    Node root; // 루트 노드
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public void add(char data, char leftData, char rightData) {

        if (root == null) {
            if (data != '.') root = new Node(data);
            if (leftData != '.') root.left = new Node(leftData);
            if (rightData != '.') root.right = new Node(rightData);
        } else search(root, data, leftData, rightData);
    }

    private void search(Node root, char data, char leftData, char rightData) {

        if (root == null) return;
        else if (root.data == data) {
            if (leftData != '.') root.left = new Node(leftData);
            if (rightData != '.') root.right = new Node(rightData);
        } else {
            search(root.left, data, leftData, rightData);
            search(root.right, data, leftData, rightData);
        }
    }

    public void preOrder(Node root) throws IOException { // 전위 순회

        bw.write(root.data);
        bw.flush();
        if (root.left != null) preOrder(root.left);
        if (root.right != null) preOrder(root.right);
    }

    public void inOrder(Node root) throws IOException { // 중위 순회

        if (root.left != null) inOrder(root.left);
        bw.write(root.data);
        bw.flush();
        if (root.right != null) inOrder(root.right);
    }

    public void postOrder(Node root) throws IOException { // 후위 순회

        if (root.left != null) postOrder(root.left);
        if (root.right != null) postOrder(root.right);
        bw.write(root.data);
        bw.flush();
    }
}

public class Main {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int i, n = Integer.parseInt(br.readLine());
        Tree tree = new Tree();
        char data[];

        for (i = 0; i < n; i++) {
            data = br.readLine().replaceAll(" ", "").toCharArray();
            tree.add(data[0], data[1], data[2]);
        }

        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
    }
}