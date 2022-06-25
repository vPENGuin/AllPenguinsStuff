import com.google.gson.Gson;
import okhttp3.OkHttpClient;

import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import static java.util.concurrent.TimeUnit.HOURS;
import static sun.tools.jstat.Scale.HOUR;

public class Main {
    public static final String URL = "http://bulk.openweathermap.org/sample/daily_16.json.gz";

    public static void main(String[] args) {

        ExecutorService executor = Executors.newScheduledThreadPool(1);

        OkHttpClient client = new OkHttpClient();
        Gson gson = new Gson();

        ScheduledExecutorService scheduler =
                Executors.newScheduledThreadPool(1);




        }

    public void updatePerHour() {

        Timer scheduler = new Timer();
        final ScheduledFuture<?> beeperHandle =
                scheduler.scheduleAtFixedRate(URL, 1, HOURS);




    }

    public void givenUsingExecutorService_whenSchedulingRepeatedTask_thenCorrect()
            throws InterruptedException {
        TimerTask repeatedTask = new TimerTask() {
            public void run() {
                System.out.println("Task performed on " + new Date());
            }
        };
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        long delay  = 1000L;
        long period = 1000L;
        executor.scheduleAtFixedRate(repeatedTask, delay, period, TimeUnit.MILLISECONDS);

    }
}
