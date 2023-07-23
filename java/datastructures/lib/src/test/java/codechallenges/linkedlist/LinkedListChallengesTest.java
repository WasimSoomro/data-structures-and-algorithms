package codechallenges.linkedlist;

import datastructures.linkedlist.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

//public class LinkedListChallengesTest
//{
//  @Test
//  void testAChallenge()
//  {
//    LinkedListChallenges sut = new LinkedListChallenges();
//    sut.linkedListChallenge06();
//    System.out.println("test something here");
//    assertTrue(true);
//  }
}

public class LinkedListChallengesTest {

  @Test
  void testLinkedList() {
    // create an instance of LinkedList
    LinkedList list = new LinkedList();

    // test insert method
    list.insert(1);
    list.insert(2);
    list.insert(3);

    // test includes method
    assertTrue(list.includes(1));
    assertTrue(list.includes(2));
    assertTrue(list.includes(3));
    assertFalse(list.includes(4));

    // test toString method
    assertEquals("1 -> 2 -> 3 -> null", list.toString());
  }
}
