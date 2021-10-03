public class StackUsingArray {
  public static void main(String args[]) {
    Stack stack = new Stack();
    System.out.println("isEmpty()::" + stack.isEmpty());
    stack.push(55);
    stack.push(778);
    stack.push(11);
    stack.peak();
    stack.pop();
    stack.peak();
    stack.print();
  }
}

class Stack {
  int MAX = 1000;
  int top;
  int[] arr = new int[MAX];

  Stack() {
    top = -1;
  }

  public boolean isEmpty() {
    if(top<0) return true;
    else return false;
  }

  public void push(int value) {
    if(top > MAX-1) {
      System.out.println("Stack overflow");
    }
    else {
      arr[++top] = value;
    }
  }

  public void pop() {
    if(top < 0) System.out.println("Stack underflow");
    else System.out.println("popped out" + arr[top--]);
  }

  public void peak() {
    if(top >= 0) {
      System.out.println("Peek is "+ arr[top]);
    }
  }

  public void print() {
    for(int i =0; i< arr.length && i<=top ; i++) {
      System.out.println(arr[i]);
    }
  }
}