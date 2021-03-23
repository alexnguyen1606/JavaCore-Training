package udemy.javamultithreadconcurrency.hackvalt;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:17 AM ,February 20,2021
 */
public class AscendingThread extends HackerThread {
    public AscendingThread(Vault vault) {
        super(vault);
    }
    
    @Override
    public void run() {
        for (int i = 0; i < Vault.MAX_PASSWORD; i++) {
            if (vault.isCorrectPassword(i)) {
                System.out.println("Password is:" + i);
                System.exit(0);
            }
        }
    }
}
