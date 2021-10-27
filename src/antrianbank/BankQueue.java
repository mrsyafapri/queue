package antrianbank;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class BankQueue {

    App head, tail;

    public BankQueue() {
        head = null;
        tail = null;
    }

    public void enque() {
        App baru = new App();
        baru.input();
        if (head == null) {
            head = baru;
        } else {
            tail.next = baru;
        }
        tail = baru;
    }

    public void deque() {
        if (head == null) {
            System.out.println("- Kosong -");
        } else {
            System.out.println("Keluar Data Dengan Id : " + head.id);
            head = head.next;
        }
    }

    public void view() {
        if (head == null) {
            System.out.println("- Kosong -");
        } else {
            System.out.println("|| Id \t|| Nama \t|| CS \t||");
            for (App a = head; a != null; a = a.next) {
                a.read();
            }
        }
    }
}
