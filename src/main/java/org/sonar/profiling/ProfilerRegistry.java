package org.sonar.profiling;

public class ProfilerRegistry {
  private final Store store;

  public ProfilerRegistry(Store store) {
    this.store = store;
  }

  public Profiler start(String message) {
    return new BaseProfiler(store, message);
  }

  public Store getStore() {
    return store;
  }
}
