package Lesen18;

public class ParametrizeMethod {
    public static void main(String[] args) {
        ParamMetod method=new ParamMetod();
        method.print("qew",123);
    }
}
class ParamMetod{
    private int i=0;
    public <K,V> void print(K key,V value){
        System.out.println(key+" "+value);
    }
}
