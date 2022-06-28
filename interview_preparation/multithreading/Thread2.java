public class Thread2 implements Runnable{

public void run(){

System.out.println ("run");
throw new RuntimeException ("Problem");


}

public static void main(String args []){


Thread t = new Thread (new Thread2());
t.start();
System.out.println("End of Method");

}

}



C:\Users\Manipradeep_Maricham\Desktop\java>java Thread2.java
End of Method
run
Exception in thread "Thread-0" java.lang.RuntimeException: Problem
        at Thread2.run(Thread2.java:6)
        at java.base/java.lang.Thread.run(Thread.java:833)

C:\Users\Manipradeep_Maricham\Desktop\java>