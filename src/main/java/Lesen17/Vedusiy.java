package Lesen17;
// Добавить 3 певца
//
public class Vedusiy {
    public static void main(String[] args) {
       // Лог ведущий начинает концерт
        System.out.println("Concert nacalo");
        Pevec1 pevec1 = new Pevec1(2);
        Pevec2 pevec2 = new Pevec2();
        Pevec3 pevec3=new Pevec3();
        pevec3.setDaemon(true);
        // лог ведущий запустил певца 1
        // через сетлог
        pevec1.start();
        pevec2.start();
        pevec3.start();
//        while (pevec1.isAlive()) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("koncert konec");

    }
}
