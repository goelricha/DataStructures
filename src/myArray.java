import java.util.Timer;
import java.util.TimerTask;

public class myArray {
    private int[] A;
    private int N;
    public myArray(int[] elements)
    {
        setA(elements);
    }

    public int[] getA() {
        return A;
    }

    private void setA(int[] a) {
        this.A = a;
        this.N=this.A.length;
    }

    public void reverse(int start, int end){
        Timer timer = new Timer(true);
        InterruptTimerTask interruptTimerTask = new InterruptTimerTask(Thread.currentThread());
        timer.schedule(interruptTimerTask, 3000);
        try{
            int i=start;
            int j= end;
            while(i<j){
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
                i++;
                j--;
            }
            
        }
        catch(Exception ex){
            System.out.println("Exception: "+ ex.toString());
        }
        finally {
            timer.cancel();
        }
    }

    public void rotate(int k){
        k=k%N;
        try{
            reverse(0,N-1);
            reverse(0,k-1);
            reverse(k,N-1);
        }
        catch(Exception ex){
            System.out.println("Exception: "+ ex.toString());
        }
    }




    protected class InterruptTimerTask extends TimerTask {

        private Thread theTread;
        
        public InterruptTimerTask(Thread theTread) {
            this.theTread = theTread;
        }
    
        @Override
        public void run() {
            theTread.interrupt();
        }
    }
}
