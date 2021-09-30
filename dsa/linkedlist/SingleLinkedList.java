import java.util.Arrays;
public class SingleLinkedList {
  public static void main(String args[]) {
    //Instantiating LinkedList class and inserting values
    LinkedList ll = new LinkedList();
    ll.head = new Node(6);
    Node first = new Node(2);
    Node second = new Node(3);
    //Linking the nodes
    ll.head.next = first;
    first.next = second;

    //Inserting new Node at the beginning of the list
    ll.push(10); //Time complexity - O(1)

    //Inserting new node in the middle
    ll.insertAfter(first, 456); //Time complexity - O(1)

    //Inserting new node at the end
    ll.insertAtEnd(77); // Time complexity - O(n) - Can be optimized if tail pointer is used.

    //Deleting a node in linkedlist
    ll.delete(10);

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
  public void push(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
  }

  public void insertAfter(Node previous, int newData) {
    if(previous != null) {
      Node newNode = new Node(newData);
      Node nextNode = previous.next;
      previous.next = newNode;
      newNode.next= nextNode;
    }
  }

  public void insertAtEnd(int newData) {
    Node newNode = new Node(newData);
    newNode.next = null;
    Node n = head;
    while(n != null) {
      if(n.next == null) {
        Node lastNode = n;
        lastNode.next = newNode;
        break;
      } else {
        n= n.next;
      }
    }
  }

  public void delete(int deleteValue) {
    Node n = head;
    Node previous = null;
    if(n.value == deleteValue) {
      head = n.next;
      return;
    }
    else {
      previous = n;
      n = n.next;
    }
    
    while(n!=null) {
      if(n.value == deleteValue) {
        previous.next = n.next;
        break;
      }
      else {
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