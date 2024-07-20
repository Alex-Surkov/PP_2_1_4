package app.model;

import org.springframework.stereotype.Component;

@Component("timer")
public class Timer {
    public Timer() {
    }

    @Override
    public String toString() {
        return "Timer{" +
                "nanoTime=" + nanoTime +
                '}';
    }

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
