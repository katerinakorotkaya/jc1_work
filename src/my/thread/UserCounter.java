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
        UserCounter userCounter = new UserCounter();
        userCounter.setName("userCounterThread");
        userCounter.start();

        while (true){
            //
        }
    }
}

