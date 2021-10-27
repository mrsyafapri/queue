package roundrobinscheduler;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class App {

    public static void main(String[] args) {
        try {
            Thread1 first = new Thread1();
            Thread2 second = new Thread2();

            first.start(); // First is scheduled for running
            second.start(); // Second is scheduled for running

            System.out.println("Revive the second thread"); // If it is suspend
            second.resume();

            System.out.println("Sleep for 3000ms");
            Thread.sleep(3000);

            System.out.println("Wake up second thread and finished running");
            System.out.println("Demonstration is finished");
        } catch (InterruptedException ex) {

        }
    }
}
