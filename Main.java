import threads.MultiThreading;
import threads.SampleThread;
import threads.SampleThreadForRunnable;

public class Main {
    public static void main(String[] args) {

/*        //thread class
        SampleThread obj=new SampleThread();
        obj.start();

        //runnable interface
        SampleThreadForRunnable sampleThreadForRunnable=new SampleThreadForRunnable();
        Thread thread=new Thread(sampleThreadForRunnable);
        thread.start();
 */
        /*multi threading*/

        //thread class
        MultiThreading multiThreading=new MultiThreading();
        multiThreading.start();

        //thread interface
        SampleThreadForRunnable sampleThreadForRunnable=new SampleThreadForRunnable();
        Thread thread=new Thread(sampleThreadForRunnable);
        thread.start();

        for(int i=0;i<1000;i++){
            System.out.println("parent "+i);
        }


    }
}