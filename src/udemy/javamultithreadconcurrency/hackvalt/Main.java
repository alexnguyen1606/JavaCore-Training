package udemy.javamultithreadconcurrency.hackvalt;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:24 AM ,February 20,2021
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Vault vault = new Vault(random.nextInt(Vault.MAX_PASSWORD));
        List<Thread> threads = new ArrayList<>();
        threads.add(new AscendingThread(vault));
        threads.add(new PoliceThread());
        threads.add(new DescendingThread(vault));
        for (Thread thread : threads){
            thread.run();
        }
        
    }
}
