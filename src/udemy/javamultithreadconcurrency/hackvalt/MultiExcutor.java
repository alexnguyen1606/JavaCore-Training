package udemy.javamultithreadconcurrency.hackvalt;

import designpattern.command.remotecontrol.devices.Light;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * 11:47 AM ,February 20,2021
 */
public class MultiExcutor {
    private List<Runnable> list  = new ArrayList<>();
    
    public MultiExcutor(List<Runnable> list) {
        this.list = list;
    }
    
    public void executeAll(){
        for (Runnable runnable  : list){
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}
