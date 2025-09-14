import threads.SampleThread;
import threads.SampleThreadForRunnable;

public class Main {
    public static void main(String[] args) {

        //thread class
        SampleThread obj=new SampleThread();
        obj.start();

        //runnable interface
        SampleThreadForRunnable sampleThreadForRunnable=new SampleThreadForRunnable();
        Thread thread=new Thread(sampleThreadForRunnable);
        thread.start();


    }
}