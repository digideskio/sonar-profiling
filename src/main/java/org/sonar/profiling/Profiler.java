package org.sonar.profiling;

public interface Profiler {

  void stop();

  String getMessage();

  long getContext();

  boolean isStopped();

  long getDurationNs();
}
