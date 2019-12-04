package main.data.structure.ex.pgms;

class Node<T> {
  T key;
  int height;
  Node<T> left, right;

  Node(Node<T> n, T key) {
    this.key = key;
    this.height = 1;
  }
}

public class AVLTree {

  public Node<Integer> root;

  public int height(Node<Integer> node) {
    if (node == null)
      return 0;

    return node.height;
  }

  public int max(int a, int b) {
    return a > b ? a : b;
  }

  public int getBalance(Node<Integer> node) {
    if (node == null)
      return 0;

    return height(node.left) - height(node.right);
  }

  public Node<Integer> leftRotate(Node<Integer> x) {
    Node<Integer> y = x.right;
    Node<Integer> T2 = y.left;

    // Perform rotation
    y.left = x;
    x.right = T2;

    // Update heights
    x.height = max(height(x.left), height(x.right)) + 1;
    y.height = max(height(y.left), height(y.right)) + 1;

    // Return new root
    return y;
  }

  public Node<Integer> rightRotate(Node<Integer> y) {
    Node<Integer> x = y.left; // null
    Node<Integer> T2 = x.right; // 40

    // Perform rotation
    x.right = y; // 30
    y.left = T2; // 40

    // Update heights
    y.height = max(height(y.left), height(y.right)) + 1;
    x.height = max(height(x.left), height(x.right)) + 1;

    // Return new root
    return x;
  }

  public Node<Integer> insert(Node<Integer> node, int key) {

    if (node == null)
      return new Node<Integer>(node, key);

    if (node.key < key) {
      node.right = insert(node.right, key);
    } else if (node.key > key) {
      node.left = insert(node.left, key);
    } else {
      return node;
    }

    // updating the height
    node.height = 1 + max(height(node.left), height(node.right));

    // finding the balance factor
    int balance = getBalance(node);

    // based on balance factor we may came to four cases
    // first case - right-rotate
    if (balance > 1 && key < node.left.key) {
      return rightRotate(node);
    }

    // second case - left-rotate
    if (balance < -1 && key > node.right.key) {
      return leftRotate(node);
    }

    // Left Right Case
    if (balance > 1 && key > node.left.key) {
      node.left = leftRotate(node.left);
      return rightRotate(node);
    }

    // Right Left Case
    if (balance < -1 && key < node.right.key) {
      node.right = rightRotate(node.right);
      return leftRotate(node);
    }

    return node;
  }

  public void preOrder(Node<Integer> node) {
    if (node != null) {
      System.out.print(node.key + " ");
      preOrder(node.left);
      preOrder(node.right);
    }
  }

  public static void main(String[] args) {
    AVLTree tree = new AVLTree();
    tree.root = tree.insert(tree.root, 10);
    tree.root = tree.insert(tree.root, 20);
    tree.root = tree.insert(tree.root, 30);
    tree.root = tree.insert(tree.root, 40);
    tree.root = tree.insert(tree.root, 50);
    tree.root = tree.insert(tree.root, 25);

    System.out.println("Print the tree structure :");
    tree.preOrder(tree.root);
  }
}
