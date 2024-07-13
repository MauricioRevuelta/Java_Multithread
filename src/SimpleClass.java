import java.util.Date;
public class SimpleClass implements Runnable{
    @Override
    public void run() {
        // Print current timestamp and thread name
        System.out.println(new Date() + " - Thread: " + Thread.currentThread().getName());
    }
}
