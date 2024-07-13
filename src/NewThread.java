public class NewThread extends Thread{

    public void run() {
        try {
            for (int i = 1; i < 6; i++) {
                System.out.println(i);

                // Adding sleep function to simulate the task taking time
                Thread.sleep(2000);

            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }
    }

}
