package circularqueue;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class App {

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");
        queue.enqueue("E");
        queue.dequeue();
        queue.peek();
        queue.dequeue();
        queue.peek();
        queue.dequeue();
        queue.peek();
        queue.dequeue();
        queue.peek();
        queue.enqueue("G");
        queue.peek();
        queue.dequeue();
        queue.peek();
        queue.dequeue();
        queue.peek();
    }
}
