import java.util.Date;
import java.util.TimerTask;

public class FooTimerTask extends TimerTask {
    private String name;

    public FooTimerTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("name="+name+ ",startTime="+new Date());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("name="+name+ ",endTime="+new Date());
    }
}
