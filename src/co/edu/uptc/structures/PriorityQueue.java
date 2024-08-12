package co.edu.uptc.structures;

import java.util.ArrayList;

public class PriorityQueue<T> {
  private ArrayList<MyQueue<T>> queues;

  public PriorityQueue() {
    this.queues = new ArrayList<>();
  }

  public void push(int priority, T data) {
    if (priority >= 0 && priority < queues.size()) {
      queues.get(priority).push(data);
    } else {
      for (int i = queues.size(); i < priority; i++) {
        queues.add(new MyQueue<>());
      }
      queues.add(new MyQueue<>());
      queues.get(priority).push(data);
    }
  }

  public T poll() {
    for (MyQueue<T> queue : queues) {
      if (!queue.isEmpty()) {
        return queue.poll();
      }
    }
    return null;
  }

  public T peek() {
    for (MyQueue<T> queue : queues) {
      if (!queue.isEmpty()) {
        return queue.peek();
      }
    }
    return null;
  }

  public boolean isEmpty() {
    for (MyQueue<T> queue : queues) {
      if (!queue.isEmpty()) {
        return false;
      }
    }
    return true;
  }

}
