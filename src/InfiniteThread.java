public class InfiniteThread extends Thread{

    @Override
    public void run() {
        try {
            while(true){
                if (Thread.currentThread().isInterrupted()){
                    System.out.println("Thread interrupted. Exiting...");
                    break;
                }
                System.out.println("Infinite Thread is running...");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Infinite Thread was interrupted.");
        }
    }

}
