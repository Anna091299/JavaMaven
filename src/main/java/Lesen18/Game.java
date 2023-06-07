package Lesen18;

import java.util.Random;

public class Game {
    public static <T extends Emploe> void printWinner(Team<T> t1, Team<T> t2) {
        Random random = new Random();
        int i = random.nextInt(2);
            if (i == 1) {
                System.out.println(t1.getName());
            } else {
                System.out.println(t2.getName());
            }
    }
}
