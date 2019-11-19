package ThreadDemo;

import java.util.concurrent.Callable;

public class Mycallable implements Callable<String>{
    @Override
    public String call()throws Exception{
        String value ="test";
        System.out.println("Task is ready");
        Thread.currentThread().sleep(2000);
        System.out.println("Task has done");
        return value;
    }
}
