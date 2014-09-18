package org.sonar.profiling;

public class BaseProfiler implements Profiler {

  private final long context;
  private final Store store;
  private final long startTime;
  private long stopTime = 0L;
  private final String message;

  public BaseProfiler(long context, Store store, String message) {
    this.context = context;
    this.store = store;
    this.message = message;
    this.startTime = System.nanoTime();
  }

  @Override
  public void stop() {
    stopTime = System.nanoTime();
    store.store(this);
  }

  @Override
  public String getMessage() {
    return message;
  }

  @Override
  public boolean isStopped() {
    return stopTime > 0L;
  }

  public long getContext() {
    return context;
  }

  @Override
  public long getDurationNs() {
    if (stopTime <= 0L) {
      return System.nanoTime() - startTime;
    }
    return stopTime - startTime;
  }
}
