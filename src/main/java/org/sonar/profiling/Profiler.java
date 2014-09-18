package org.sonar.profiling;

public interface Profiler {
  Profiler start();
  void stop();
}
