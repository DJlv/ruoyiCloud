import com.alibaba.nacos.common.JustForTest;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class BaseTest {
    @Test
    public void test001() {
        Timer t = new Timer();
        for(int i= 0;i<2;i++) {
            TimerTask task = new FooTimerTask("foo" + i);
            t.schedule(task,new Date(),2000);
        }
    }
}
