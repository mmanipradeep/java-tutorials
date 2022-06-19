package main.proxy.pattern;

public class ProxyPatternDriver {
    public static void main(String[] args) {
        ExpensiveObject object =new ExpensiveObjectImpl();
        object.process();
        object.process();
        object.process();
    }
}
