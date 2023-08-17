package codechallenges.stack;
import codechallenges.stack.Node;
public class Stack<T>
{
  public Node<T> top;

  public void push(T valueToPush)
  {
    Node<T> newNode = new Node<>(valueToPush);
    newNode.next = top;
    top = newNode;
  }

  public T pop()
  {
    if (top == null) return null;
    T value = top.value;
    top = top.next;
    return value;
  }

  public T peek()
  {
    return top != null ? top.value : null;
  }


  public boolean isEmpty()
  {
    return top == null;
  }
}


//Referenced ChatGPT
