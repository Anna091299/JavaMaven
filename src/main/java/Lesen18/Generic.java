package Lesen18;

import java.util.ArrayList;

public class Generic {
    public static void main(String[] args) {
        ArrayList<Integer> qwe = new ArrayList<>();
        qwe.add(123);
        ArrayList q = new ArrayList();
        q.add(123);
        q.add("qwe");
        q.add(new Dog());
    }
}

class Dog {

}