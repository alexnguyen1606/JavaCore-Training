package udemy.javamultithreadconcurrency.hackvalt;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:16 AM ,February 20,2021
 */
public class PoliceThread extends Thread {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(i);
        }
        System.out.println("Game over");
        System.exit(0);
    }
}
