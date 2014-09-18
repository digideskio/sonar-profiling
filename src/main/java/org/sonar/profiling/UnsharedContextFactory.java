package org.sonar.profiling;

import java.util.concurrent.atomic.AtomicLong;

import javax.annotation.concurrent.ThreadSafe;

/**
 * Each profiler has its own context, so no shared context
 */
@ThreadSafe
public class UnsharedContextFactory implements ContextFactory {

  private final AtomicLong count = new AtomicLong(0L);

  @Override
  public long get() {
    return count.getAndIncrement();
  }
}
