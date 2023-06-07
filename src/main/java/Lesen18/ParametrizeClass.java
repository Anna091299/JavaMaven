package Lesen18;

public class ParametrizeClass {
    public static void main(String[] args) {
        ParamClass<String,Integer>aClass=new ParamClass<>("qwe", 123);
        Integer print=aClass.print();
        System.out.println(print);
    }
}

class ParamClass <T,R> {
    private T value;
    private R val;

    public ParamClass(T value, R val) {
        this.value = value;
        this.val = val;
    }
    public R print (){
        System.out.println(value);
        return val;
    }
}
