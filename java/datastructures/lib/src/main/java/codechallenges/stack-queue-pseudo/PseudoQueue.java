import java.util.Stack;

class PseudoQueue {
  Stack<Integer> stack1;
  Stack<Integer> stack2;

  public PseudoQueue() {
    stack1 = new Stack<>();
    stack2 = new Stack<>();
  }

  public void enqueue(int value) {
    while (!stack1.isEmpty()) {
      stack2.push(stack1.pop());
    }
    stack1.push(value);
    while (!stack2.isEmpty()) {
      stack1.push(stack2.pop());
    }
  }

  public int dequeue() {
    if (stack1.isEmpty()) {
      System.out.println("Queue is empty");
      return -1;
    }
    return stack1.pop();
  }
}

//Used some ChatGPT assistance
