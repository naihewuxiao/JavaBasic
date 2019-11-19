package ThreadDemo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task = new FutureTask<String>(new Mycallable());
        new Thread(task).start();
        if (!task.isDone()){
            System.out.println("task has not finished");
        }
        System.out.println("task return: "+task.get());
    }
}
