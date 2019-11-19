package ThreadDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> xianshiqi = new Callable<String>() {//购买显示器的线程
            @Override
            public String call() throws Exception {
                System.out.println("购买显示器");
                Thread.currentThread().sleep(1000);
                System.out.println("显示器到货");
                return "显示器购买成功";
            }
        };
        FutureTask<String> buytask = new FutureTask<String>(xianshiqi);
        new Thread(buytask).start();

        Callable<String> zhuji = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("购买主机");
                Thread.currentThread().sleep(1000);
                System.out.println("主机到货");
                return "主机购买成功";
            }
        };
        FutureTask<String> buytask1 = new FutureTask<String>(zhuji);
        new Thread(buytask1).start();

        //FutureTask<String> task = new FutureTask<String>(new Mycallable());
        //new Thread(task).start();
        if (!buytask.isDone()){
            System.out.println("显示器未到货");
        }
        if (!buytask1.isDone()){
            System.out.println("主机未到货");
        }
        System.out.println(buytask1.get()+buytask.get());

    }
}
