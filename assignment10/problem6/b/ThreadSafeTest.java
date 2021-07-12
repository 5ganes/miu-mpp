package assignment10.problem6.b;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadSafeTest {
    private static Queue obj = new Queue();
    private static Executor exec = Executors.newCachedThreadPool();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            multipleCalls();

            // expected output at last run is 5000 and gives 5000.
            // each time a thread is created, 500 elements are added in the queue
            System.out.println(obj.size());
        }
    }

    public static void multipleCalls() {
        Runnable r = () -> {
            for (int i = 0; i < 50; i++){
                obj.add("Element " + (int)Math.ceil(Math.random() * 1000));
            }
        };
        for (int i = 0; i < 10; i++){
            exec.execute(r);
        }
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e){

        }
    }

}
