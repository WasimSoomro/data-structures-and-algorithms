package datastructures.stack;

import codechallenges.stack.Stack;
import codechallenges.stack.Node;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StackTest {
  @Test
  public void stackPushTest()
  {
    Stack<Integer> sut = new Stack<>();
    sut.push(5);
    Integer expected = 5;
    Integer actual = sut.top.value;

    assertEquals(expected, actual, "5");
  }
}
