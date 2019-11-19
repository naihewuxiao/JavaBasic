package ThreadDemo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPool {
    public static void main(String[] args){
        ExecutorService newThreadPool = Executors.newCachedThreadPool();
        Future<String> future = newThreadPool.submit(new Mycallable());
        if(!future.isDone()){
            System.out.println("task has not finished");
        }
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }finally {
            newThreadPool.shutdown();
        }
    }
}
