package ThreadDemo;

public class CycleWait implements Runnable{
    private String vaule;
    @Override
    public void run(){
        try {
            Thread.currentThread().sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        vaule="now have data";
    }
    public static void main(String[] args) throws InterruptedException {
        CycleWait cw = new CycleWait();
        Thread t = new Thread(cw);
        t.start();
        /*while (cw.vaule==null){
            //Thread.currentThread().sleep(1000);
            System.out.println(1);
        }*/
        t.join();
        System.out.println(cw.vaule);
       // System.out.println(2);
    }
}
