package udemy.javamultithreadconcurrency.hackvalt;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:15 AM ,February 20,2021
 */
public abstract  class HackerThread extends Thread {
    protected Vault vault;
    public HackerThread(Vault vault){
        this.vault = vault;
        this.setPriority(Thread.MAX_PRIORITY);
        this.setName(this.getClass().getSimpleName());
    }
    
    @Override
    public  void start() {
        System.out.println("Start thread "+this.getName());
        super.start();
    }
}
