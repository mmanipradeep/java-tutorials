abstract class A {

    public void static  print() {
        System.out.println("print red");
    }

    abstract public void sayHello();


    public void sayBye() {
        System.out.println("print green");
    }

    public void runner() {
        print();
        sayHello();
        sayBye();
    }

}

public class ChildClass extends A {

    public void static print() {
        System.out.println("print blue");
    }

    public void sayHello() {
        System.out.println("print hello");
    }

    public static void main(String... args) {
        try {
            A aObject = new ChildClass();
            aObject.runner();

        } catch (Exception ex) {
            System.out.println("in catch");
        }
    }
}