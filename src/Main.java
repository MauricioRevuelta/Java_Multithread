import java.util.Date;

public class Main {
    public static void main(String[] args) {
        NewThread t1 = new NewThread();

        // Print the state before starting the thread
        System.out.println("State before starting: " + t1.getState());

        // Start thread
        t1.start();

        // Print the state after starting the thread
        System.out.println("State after starting: " + t1.getState());

        try {
            // Give some time for the thread to run before checking the state again
            Thread.sleep(100);

            // Print the state after some sleep period
            System.out.println("State during execution: " + t1.getState());

            // Wait for the thread to complete
            t1.join();

            // Print the state after the thread has completed its execution
            System.out.println("State after completion: " + t1.getState());

        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        // Create a runnable object and start the thread
        Thread runnable1 = new Thread(new MyRunnable());
        runnable1.start();

        // Create and managing multiple threads
        Thread thread1 = new Thread(new SimpleClass());
        Thread thread2 = new Thread(new SimpleClass());
        Thread thread3 = new Thread(new SimpleClass());

        // Starting multiple threads
        thread1.start();
        thread2.start();
        thread3.start();


        // Create an infinite thread
        Thread infThread = new Thread(new InfiniteThread());

        // Start the infinite thread
        infThread.start();

        // Sleep the infinite thread
        try {
            Thread.sleep(5000); // Sleep for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupt the infinite thread
        infThread.interrupt();

    }
}
