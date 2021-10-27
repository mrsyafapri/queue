package circularqueue;

import java.util.ArrayList;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
class CircularQueue {

    private final int MAX_SIZE = 5;
    private final ArrayList<String> elements;
    private final int size;

    private int front;
    private int rear;

    CircularQueue() {
        elements = new ArrayList<>();
        size = MAX_SIZE;
        front = -1;
        rear = front;
    }

    public void enqueue(String newElement) {
        if (isFull()) {
            System.out.println("Cannot enqueue " + newElement + ", Queue are full");
        } else if (isEmpty()) {
            front = 0;
            rear = 0;
            elements.add(rear, newElement);
            System.out.println("enqueue " + newElement);
        } else if (rear == size - 1 && front != 0) {
            rear = 0;
            elements.set(rear, newElement);
            System.out.println("enqueue " + newElement);
        } else {
            rear = (rear + 1);
            if (front <= rear) {
                elements.add(rear, newElement);
            } else {
                elements.set(rear, newElement);
            }
            System.out.println("enqueue " + newElement);
        }
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Cannot dequeue, Queue are empty");
            return null;
        }
        String deletedElement = elements.get(front);
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front = front + 1;
        }
        System.out.println("dequeue " + deletedElement);
        return deletedElement;
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Cannot peek, Queue are empty");
            return null;
        }
        System.out.println("front element " + elements.get(front) + "\t\trear element " + elements.get(rear));
        return elements.get(front);
    }

    public boolean isFull() {
        return (front == 0 && rear == MAX_SIZE - 1) || (rear == (front - 1) % (MAX_SIZE - 1));
    }

    public boolean isEmpty() {
        return (front == -1);
    }
}
