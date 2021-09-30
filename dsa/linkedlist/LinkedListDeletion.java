
public class LinkedListDeletion {
  public static void main(String args[]) {
    //Instantiating LinkedList class and inserting values
    LinkedList ll = new LinkedList();
    ll.head = new Node(6);
    Node first = new Node(2);
    Node second = new Node(3);
    Node third = new Node(6);
    Node fourth = new Node(8);

    //Linking the nodes
    ll.head.next = first;
    first.next = second;
    second.next = third;
    third.next = fourth;

    //Deleting node at a given position
    ll.deleteNode(3);

    //Printing the linked list
    Node n = ll.head;
    while(n != null) {
      System.out.println(n.value);
      n = n.next;
    }
  }
}
//Creating a linkedlist class with head node
class LinkedList {
  Node head;

  public void deleteNode(int position) {
    int tempPosition = 0;
    Node previous = null;
    Node n = head;
    if(position == 0) {
       head = head.next;
       return;
    }
    else {
      tempPosition++;
      previous = n;
      n = n.next;
    }
    while(n!=null) {
      if(position == tempPosition) {
        previous.next = n.next;
        break;
      } else {
        tempPosition++;
        previous = n;
        n = n.next;
      }
    }
  }
}

//Creating a Node class with constructor
class Node {
  int value;
  Node next;
  Node(int d) {
    value=d;
    next=null;
  }
}