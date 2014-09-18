package org.sonar.profiling;

/**
 * Shortcut over ProfilerRegistry
 */
public class Profilers {

  private static ProfilerRegistry registry = createDefault();

  public static Profiler start(String message) {
    return registry.start(message);
  }

  public static void setRegistry(ProfilerRegistry r) {
    Profilers.registry = r;
  }

  public static ProfilerRegistry getRegistry() {
    return registry;
  }

  private static ProfilerRegistry createDefault() {
    SysoutStore store = new SysoutStore();
    ContextFactory contextFactory = new UnsharedContextFactory();
    return new ProfilerRegistry().setStore(store).setContextFactory(contextFactory);
  }
}
