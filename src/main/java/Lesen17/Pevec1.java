package Lesen17;

public class Pevec1 extends Thread {
    private int count = 5;
    public Pevec1 (){}
   public Pevec1 (int count){
       this.count=count;
   }
//   volatile - переменная для проверки начального с записывающимся
    //    run - бежит по коду
    // исправлять try } catch
    @Override
    public void run() {
        int j = 0;
        while (j < count) {
            for (int i = 0; i < 3; i++) {
                System.out.println("La_La_LA________");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Monitors.MIKROFON) {
                Monitors.MIKROFON.notify();
            }
            synchronized (Monitors.MIKROFON) {
                try {
                    Monitors.MIKROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            j++;
        }
    }
}
