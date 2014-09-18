package org.sonar.profiling;

public interface Profiler {

  void stop();

  String getMessage();

  boolean isStopped();

  long getDurationNs();
}
