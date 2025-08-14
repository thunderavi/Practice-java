package Collection_interfaces;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_interface {
    public static void main(String[] args) {

    //First-in-first-out
    Queue<Integer> queue = new LinkedList<>();
    queue.add(1);
    queue.offer(2);
      utiltiy.print(queue);

        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println(queue.remove());
        System.out.println(queue.poll());

    }
}
