package datastructures.tree;

import java.util.ArrayList;

public class BinaryTree<T> {
  Node<T> root;
  public Object[] preOrderTraversal() {
    ArrayList<T> outputList = new ArrayList<>();
    preOrder(root, outputList);
    return outputList.toArray();
  }
  private void preOrder(Node<T> node, ArrayList<T> outputList) {
    if (node != null) {
      outputList.add(node.value); // Add the current node value to the list
      preOrder(node.leftNode, outputList); // Traverse left subtree
      preOrder(node.rightNode, outputList); // Traverse right subtree
    }
  }
  public Object[] inOrderTraversal() {
    ArrayList<T> outputList = new ArrayList<>();
    inOrder(root, outputList);
    return outputList.toArray();
  }
  private void inOrder(Node<T> node, ArrayList<T> outputList) {
    if (node != null) {
      inOrder(node.leftNode, outputList); // Traverse left subtree
      outputList.add(node.value); // Add the current node value to the list
      inOrder(node.rightNode, outputList); // Traverse right subtree
    }
  }
  public Object[] postOrderTraversal() {
    ArrayList<T> outputList = new ArrayList<>();
    postOrder(root, outputList);
    return outputList.toArray();
  }
  private void postOrder(Node<T> node, ArrayList<T> outputList) {
    if (node != null) {
      postOrder(node.leftNode, outputList); // Traverse left subtree
      postOrder(node.rightNode, outputList); // Traverse right subtree
      outputList.add(node.value); // Add the current node value to the list
    }
  }
}
