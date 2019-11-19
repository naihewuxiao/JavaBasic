package ThreadDemo;

public class StartAndRun {
    private static void attack(){
        System.out.println("fight");
        System.out.println("current Thread is: "+ Thread.currentThread().getName());

    }
    public static void main(String args[]){
        /*Thread t = new Thread(){
            public void run(){
                attack();
            }
        };
        System.out.println("current main Thread is: "+ Thread.currentThread().getName());
        t.start();*/
        TestThread t = new TestThread("abc");
        TestThread t1 = new TestThread("abcd");
        TestThread t2 = new TestThread("abcdef");
        t.start();
        t1.start();
        t2.start();
    }
}
