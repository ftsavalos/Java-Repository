package demo.utils;

import java.time.Duration;
import java.time.Instant;

public class UtilOperations {

    public static TimeTracking retry(int maxAttempts, Operation operation) {
        int actualAttempts = maxAttempts;
        TimeTracking time = new TimeTracking();
        Instant beforeFirstAttempt = Instant.now();

        do {
            try {
                operation.doIt();
                time.setDuration(Duration.between(beforeFirstAttempt,Instant.now()));
                time.setNumOfAttempts((maxAttempts-actualAttempts) + 1);
                time.setSuccess(true);
                return time;
            } catch (Throwable t) {
                operation.handleThrowable(t);
            }
        } while (--actualAttempts > 0);
        return new TimeTracking(Duration.between(beforeFirstAttempt,Instant.now()),maxAttempts);
    }
}