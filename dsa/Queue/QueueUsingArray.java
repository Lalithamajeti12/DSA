public class QueueUsingArray {
  public static void main(String args[]) {
    Queue q = new Queue(10);
    q.enqueue(3);
    q.printQueue();
    q.enqueue(5);
    q.printQueue();
    q.dequeue();
    q.printQueue();
    System.out.println("Front--"+ q.front());
    System.out.println("Rear---"+ q.rear());
  }
}

class Queue {
  int front, rear,size,capacity;
  int[] arr;
  Queue(int capacity) {
    this.capacity = capacity;
    this.front = 0;
    this.rear = -1;
    this.size = 0;
    arr = new int[capacity];
  }

  public void enqueue(int num) {
    if(size >= capacity) {
      System.out.println("Queue overflow. Cannot insert element");
    }
    else {
      arr[rear+1] = num;
      rear++;
      size++;
    }
  }

  public void dequeue() {
    if(size == 0) {
       System.out.println("Queue underflow. Cannot delete element");
    }
    else {
      front++;
      size--;
    }
  }

  public int front() {
    if(size == 0) { return -1; }
    else return front;
  }
  
  public int rear() {
    if(size == 0) { return -1; }
    else return rear;
  }

  public void printQueue() {
    for(int i=front;i<=rear;i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}