public class StackUsingLinkedList {
  public static void main(String args[]) {
    StackLinkedList sll = new StackLinkedList();
    System.out.println("isEmpty::" + sll.isEmpty());
    sll.push(33);
    sll.push(77);
    sll.push(34);
    sll.print();
    sll.pop();
    sll.print();
    sll.push(1111);
    sll.pop();
    System.out.println("isEmpty:::" + sll.isEmpty());
  }
}

class StackLinkedList {
  StackNode head = null;

  public boolean isEmpty() {
    if(head == null) return true;
    else return false;
  }

  public void push(int newValue) {
    StackNode newNode = new StackNode(newValue);
    if(head == null) head = newNode;
    else {
      newNode.next = head;
      head = newNode;
    }
  }

  public void pop() {
    if(head == null) return;
    else {
      StackNode nextNode = head.next;
      head.next = null;
      head = nextNode;
    }
  }

  public void print() {
    StackNode n = head;
    while(n!=null) {
      System.out.println(n.value);
      n=n.next;
    }
  }
}

class StackNode {
  int value;
  StackNode next;
  StackNode(int value) {
    this.value = value; 
  }
}