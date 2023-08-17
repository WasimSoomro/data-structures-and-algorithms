package codechallenges.queue;
import codechallenges.queue.Node;

public class Queue<T>
{
  Node<T> front;
  Node<T> back;

  public void enqueue(T valueToEnqueue)
  {
    Node<T> newNode = new Node<>(valueToEnqueue);
    if (back != null) newNode.next = back;
    back = newNode;
    if (front == null) front = back;
  }

  public T dequeue()
  {
    if (front == null) return null;
    T value = front.value;
    front = front.next;
    if (front == null) back = null;
    return value;

  }

  public T peek()
  {
    return front != null ? front.value : null;

  }

  public boolean isEmpty()
  {
    return front == null;
  }
}

//referenced ChatGPT
