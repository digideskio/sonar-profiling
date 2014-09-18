package org.sonar.profiling;

public class ProfilerRegistry {
  private Store store;
  private ContextFactory contextFactory;

  public Store getStore() {
    return store;
  }

  public ProfilerRegistry setStore(Store store) {
    this.store = store;
    return this;
  }

  public ContextFactory getContextFactory() {
    return contextFactory;
  }

  public ProfilerRegistry setContextFactory(ContextFactory contextFactory) {
    this.contextFactory = contextFactory;
    return this;
  }

  public Profiler start(String message) {
    return new BaseProfiler(contextFactory.get(), store).setField("msg", message);
  }

  public Profiler start(Object... keyValues) {
    return new BaseProfiler(contextFactory.get(), store).setFields(keyValues);
  }
}
