package org.sonar.profiling;

import java.util.concurrent.atomic.AtomicLong;

public class ThreadLocalContextFactory implements ContextFactory {

  private static final InheritableThreadLocal<Long> threadLocal = new InheritableThreadLocal<Long>();
  private final AtomicLong count = new AtomicLong(0L);

  @Override
  public long get() {
    Long ctx = threadLocal.get();
    if (ctx == null) {
      ctx = count.getAndIncrement();
      threadLocal.set(ctx);
    }
    return ctx;
  }

  public void clear() {
    threadLocal.remove();
  }
}
