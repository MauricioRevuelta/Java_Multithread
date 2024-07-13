public class MyRunnable implements Runnable{
    @Override
    public void run() {
        // Print the letters A to E
        for (char letter = 'A'; letter <= 'E'; letter++) {
            System.out.println(letter);
        }
    }
}
