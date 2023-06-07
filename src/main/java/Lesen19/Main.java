package Lesen19;

import Lesen16.Peson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
   //     PersonApi.getPersons(10);

    }
//    нельзя так делать
//    public void getS(ArrayList<String> strings) {}
//    public void getS(ArrayList<Integer> integers) {}
}

interface Predicato<T> {
    boolean test(T t);
}

class LamdaExample {
    public static void sortLambda(List<Peson> list, Predicato<Peson> p) {
        for (Peson peson:list){
            if (p.test(peson)) System.out.println(peson);
        }
    }
}
