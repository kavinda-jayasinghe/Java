package threads;

public class SampleThreadForRunnable implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("runnable interface "+i);
        }
    }
}
