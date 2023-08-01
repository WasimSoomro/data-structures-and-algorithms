import datastructures.tree.Node;

public class BinarySearchTree<T extends Comparable<? super T>> extends BinaryTree<T> {
  public void add(T value) {
    root = insert(root, value);
  }

  private Node<T> insert(Node<T> current, T value) {
    if (current == null) {
      return new Node<>(value);
    }
    int compareResult = value.compareTo(current.value);

    if (compareResult < 0) {
      current.leftNode = insert(current.leftNode, value);
    } else if (compareResult > 0) {
      current.rightNode = insert(current.rightNode, value);
    }

    return current;
  }

  public boolean contains(T value) {
    return search(root, value);
  }

  private boolean search(Node<T> current, T searchValue) {
    if (current == null) {
      return false;
    }

    int compareResult = searchValue.compareTo(current.value);

    if (compareResult == 0) {
      return true;
    } else if (compareResult < 0) {
      return search(current.leftNode, searchValue);
    } else {
      return search(current.rightNode, searchValue);
    }
  }
}
