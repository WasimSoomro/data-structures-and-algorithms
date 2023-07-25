package datastructures.linkedlist;

import datastructures.linkedlist.Node;

public class LinkedList {
  Node head = null;
  Node tail = null;  // not strictly required
  int size = 0;

  public void kthFromNEnd(int k) {
    if (k > this.size) {
      throw new IllegalArgumentException("k is greater than the length of the linked list");
    }
    Node curr = this.head;
    int pos = this.size - k;

    for(int i = 0; i < pos; i++) {
      curr = curr.next;
    }

  }
    //If I have 7 nodes and I pass in 5, I will be at the 2nd node
    //traverse the linkedList
    //get the size of the linkedList
    //if k is > size, then throw an exception
    //else
    //for loop
    //use a for loop to move current variable
    //current = current.next

  public void insert(int value) {
    Node newNode = new Node(value);
    newNode.next = this.head;
    this.head = newNode;
    this.size++;
  }

  public void append(int value) {
// create new node for tail
    Node newTail = new Node(value);
// create a temp/curr node for traversal
    Node curr = this.head;
// traverse the list (stop at last node)
    while(curr.next != null) {
      curr = curr.next;
    }
// make the node stopped at point at new tail
    curr.next = newTail;
  }

  public void end(int value){
//traverse to end of the list
  while(curr != null) {
//set previous to curr
    previous = curr;
//set curr to curr.next
    curr = curr.next;
// if curr holds the value we're looking for
    if(curr.value == value) {
// newNode's next = curr
      newNode.next = curr;
      prev.next = newNode;
    }
  }
// return to end of method
  return;
  throw new IllegalArgumentException("value not in list");
//if the value was never found, return an exception
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


  @Override
  public String toString() {

//    String listString = "";
    Node curr = this.head;

    StringBuilder string = new StringBuilder();

    if (curr == null) {
      return "Empty List";
    }
    while (curr != null) {
      string.append("{ ").append(curr.value).append(" } -> ");

//      listString = +" { ";
//    listString = curr.value;
//    listString = +" } ->";
      curr = curr.next;
    }
    string.append("Null");
//  listString += " Null";
    return string.toString();
  }
}

//ChatGPT help with stringbuilder
//TA Help
