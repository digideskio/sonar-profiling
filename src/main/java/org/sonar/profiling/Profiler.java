package org.sonar.profiling;

public interface Profiler {
  void start(String label);
  void stop();

  String getLabel();

  boolean isRunning();

  boolean isStopped();
}
