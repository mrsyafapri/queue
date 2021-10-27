package roundrobinscheduler;

/**
 *
 * @author Muhammad Rizki
 */
public class Thread1 extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("First thread starts running");
            Thread.sleep(10000);
            System.out.println("First thread finished running");
        } catch (Exception ex) {
        }
    }
}
