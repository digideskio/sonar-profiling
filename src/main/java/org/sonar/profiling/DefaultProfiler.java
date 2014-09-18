package org.sonar.profiling;

public class DefaultProfiler implements Profiler {

  private long startTime;
  private long stopTime;
  private String label;

  @Override
  public void start(String label) {
    if (label == null || "".equals(label)) {
      throw new IllegalArgumentException("Label must not be null or empty");
    }
    this.label = label;
    this.startTime = System.nanoTime();
    this.stopTime = -1L;
  }

  @Override
  public void stop() {
    if (startTime <= 0L) {
      throw new IllegalStateException("Can't stop profiler with is not started");
    }
    this.stopTime = System.nanoTime();
  }

  @Override
  public String getLabel() {
    return label;
  }

  @Override
  public boolean isRunning() {
    return startTime > 0L && stopTime == -1L;
  }

  @Override
  public boolean isStopped() {
    return stopTime > 0L;
  }
}
