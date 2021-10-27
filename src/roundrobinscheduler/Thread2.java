package roundrobinscheduler;

/**
 *
 * @author Muhammad Rizki
 */
public class Thread2 extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Second thread starts running");
            System.out.println("Second thread is suspended itself");
            suspend();
            System.out.println("Second thread finished running");
        } catch (Exception ex) {
        }
    }
}
