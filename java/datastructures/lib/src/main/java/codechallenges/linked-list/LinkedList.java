package datastructures.linkedlist;
import datastructures.linkedlist.Node;

public class LinkedList {
  Node head = null;
  Node tail = null;  // not strictly required

  public void insert(int value) {
    Node newNode = new Node(value);
    newHead.next = this.head;
    this.head = newHead;
  }

  //CodeReview in class

  public boolean includes(int value) {
    Node curr = head;
    while (curr != null) {
      if (curr.value == value) {
        return true;
      }
      curr = curr.next;
    }
    return false;
  }

  //  public boolean includes(int value)
//  {
//    return false;  // TODO: implement me
//  }
  @Override
  public String toString() {

    String listString = "";
    Node curr = this.head;

    if (curr = null) {
      return "Empty List";
    }
    while (curr != null) {
      listString = +" { ";
    listString = +curr.value;
    listString = +" } ->";
  }
  listString += " Null";
    return listString;
  }

//ChatGPT help with stringbuilder
