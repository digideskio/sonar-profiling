package org.sonar.profiling;

public abstract class BaseStore implements Store {

  @Override
  public final void store(Profiler profiler) {
    doStore(Formatter.format(profiler));
  }

  protected abstract void doStore(String log);
}
