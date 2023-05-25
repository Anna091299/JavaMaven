package Lesen17;

public class Main {
    public static void main(String[] args) {
       MyThread thread=new MyThread();
        thread.setDaemon(true);
        thread.start();


        for (int i = 0; i < 10; i++) {
            System.out.println(i+""+Thread.currentThread().getName());
            try {
                Thread.sleep(300);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
