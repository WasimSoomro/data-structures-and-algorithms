// append
public void append(int value) {
//create new node
  Node newTail = new Node(value);
//make tail point at new node
  this.tail.next = newTail;
  this.tail = newTail;
  }

public void append(int value) {
// create new node for tail
  Node newTail = new Node(value)
// create a temp/curr node for traversal
  Node curr = this.head;
// traverse the list (stop at last node)
  while(curr.next != null) {
  curr = curr.next;
  }
// make the node stopped at point at new tail
  curr.next = newTail
  }

public void insertBefore(int value, int newValue) throw illegalArgumentException {
//if head is null, throw an exception

  if(this.head == null) {
  throw new illegalArgumentException("value is not in list, list is empty");
  }

//create a node for traversal
  Node curr = this.head;

//create a node to keep track of previous
  Node prev = null;

//create a node with a new value
  Node newNode = new Node(value);

//if the head has the value we're looking for
  if(curr.value == value) {


//make new node point at head
  newNode.next = this.head;

//make the new node the head
  this.head = newNode;

//return to end of method
  return;

  }

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
  }
  }
  throw new IllegalArgumentException("value not in list");



//if the value was never found, return an exception
  }

//followed along Code Review in class
