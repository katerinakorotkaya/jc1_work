package my.thread;

public class UserCounter extends Thread {

    private int userCount = 0;

    @Override
    public void run() {
        while (true){
            userCount++;
        }
            }

    public static void main(String[] args) {

        try {
            int i = 0;
            while (true){
                UserCounter userCounter = new UserCounter();
                userCounter.setName("userCounterThread" + i++);
                userCounter.start();
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

