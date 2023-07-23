package datastructures.linkedlist;

import org.junit.jupiter.api.Test;
import datastructures.linkedlist.Linkedlist;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest
{
  @Test void testAMethod()
    {
      LinkedList sut = new LinkedList();
      System.out.println(sut);
      assertTrue(true);
    }

    @Test void testEmptyLinkedList() {
    //arrange
      //act
      LinkedList sut = new LinkedList();

      //assert
      assertTrue(sut.toString().equals("Empty List"))
    }
    @Test void testLinkedListInsert() {
    LinkedList sut = new LinkedList();

    //act
      sut.insert(5);
      sut.insert(10);
      sut.insert(15);

      assertTrue(sut.toString().equals(expectedOutput));
    }
    @Test void testLinkedListDoesInclude() {
    //arrange
      LinkedList sut = new LinkedList();
      sut.insert(5);
      sut.insert(10);
      sut.insert(15);
      //act
      boolean includes = sut.includs(10);
      //assert
      assertTrue(!includes);
    }

    @Test void testIncludesOnEmptyLinkedList(){
    // arrange
      LinkedList sut = new LinkedList();
    // act
      boolean includes = sut.includes(10);
      // assert
      asserFalse(!includes);
    }
}

//Testing gone over in class from CodeReview
