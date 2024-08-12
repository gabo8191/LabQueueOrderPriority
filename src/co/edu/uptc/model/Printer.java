package co.edu.uptc.model;

import co.edu.uptc.structures.PriorityQueue;

public class Printer {
  private PriorityQueue<Paper> queue;

  public Printer() {
    queue = new PriorityQueue<>();
  }

  public boolean addPaper(Paper paper, int priority) {
    queue.push(priority, paper);
    return true;
  }

  public Paper printDocument() {
    Paper printedPaper = queue.poll();
    return printedPaper;
  }

  public boolean isEmpty() {
    return queue.isEmpty();
  }

  public int assignPriority(int numberPages) {
    if (numberPages <= 10) {
      return 1;
    }
    if (numberPages > 10 && numberPages <= 20) {
      return 2;
    }
    if (numberPages > 20 && numberPages <= 30) {
      return 3;
    }
    if (numberPages > 30 && numberPages <= 40) {
      return 4;
    }
    if (numberPages > 40 && numberPages <= 50) {
      return 5;
    }
    return 6;
  }

}
