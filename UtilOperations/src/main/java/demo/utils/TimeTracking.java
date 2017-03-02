package demo.utils;

import java.time.Duration;

public class TimeTracking {

    private Duration duration;
    private int numOfAttempts;
    private boolean success;

    //
    //Constructors
    //
    public TimeTracking() {}

    public TimeTracking(Duration duration, int numOfAttempts) {
        this.duration = duration;
        this.numOfAttempts = numOfAttempts;
    }

    //
    //Accessors
    //
    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public int getNumOfAttempts() {
        return numOfAttempts;
    }

    public void setNumOfAttempts(int numOfAttempts) {
        this.numOfAttempts = numOfAttempts;
    }

    public boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    //
    //Methods overridden
    //
    @Override
    public String toString() {
        return "Number of Attempts: " + this.numOfAttempts + " || Duration: " +this.duration.toMillis() + " milliSeconds"+ " || Success: "+ this.success ;
    }
}