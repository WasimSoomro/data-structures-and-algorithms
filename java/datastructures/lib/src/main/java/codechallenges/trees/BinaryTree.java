package datastructures.tree;

import java.util.ArrayList;

public class BinaryTree<T> {
  Node<T> root;

  //Find MAX VALUE - code challenge 16
  public Number findMaximumValue() {
    return findMaximumValue(root, Double.NEGATIVE_INFINITY);
  }
  private Number findMaximumValue(Node<Number> node, double maxSoFar) {
    if (node == null) {
      return maxSoFar;
    }

    if (node.value.doubleValue() > maxSoFar) {
      maxSoFar = node.value.doubleValue();
    }

    maxSoFar = Math.max(findMaximumValue(node.leftNode, maxSoFar), maxSoFar);
    maxSoFar = Math.max(findMaximumValue(node.rightNode, maxSoFar), maxSoFar);

    return maxSoFar;
  }

// Code Challenge 15 below

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


  //CodeChallenge17
  public Object[] breadthFirstTraversal() {
    if (root == null) {
      return new Object[0];
    }

    ArrayList<T> outputList = new ArrayList<>();
    Queue<Node<T>> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      Node<T> current = queue.poll();
      outputList.add(current.value);

      if (current.leftNode != null) {
        queue.add(current.leftNode);
      }

      if (current.rightNode != null) {
        queue.add(current.rightNode);
      }
    }

    return outputList.toArray();
  }

}

//Chat GPT Help
