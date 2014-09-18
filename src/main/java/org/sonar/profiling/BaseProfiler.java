package org.sonar.profiling;

import javax.annotation.CheckForNull;
import java.util.LinkedHashMap;
import java.util.Map;

public class BaseProfiler implements Profiler {

  private final long context;
  private final Store store;
  private final long startedAt;
  private long stopTime = 0L;
  private final Map<String, Object> fields = new LinkedHashMap<String, Object>();

  public BaseProfiler(long context, Store store) {
    this.context = context;
    this.store = store;
    this.startedAt = now();
  }

  @Override
  public void stop() {
    stopTime = now();
    store.store(this);
  }

  private long now() {
    return System.currentTimeMillis();
  }

  @Override
  @CheckForNull
  public Object getField(String key) {
    return fields.get(key);
  }

  @Override
  public Map<String, Object> getFields() {
    return fields;
  }

  @Override
  public Profiler setField(String key, Object value) {
    fields.put(key, value);
    return this;
  }

  @Override
  public Profiler setTextField(String key, String value) {
    fields.put(key, value.replace("\n", "").replace("\r", ""));
    return this;
  }

  @Override
  public Profiler setFields(Object... keyValues) {
    for (int index = 0; index < keyValues.length; index++) {
      fields.put((String) keyValues[index++], keyValues[index]);
    }
    return this;
  }

  @Override
  public long getStartedAt() {
    return startedAt;
  }

  @Override
  public boolean isStopped() {
    return stopTime > 0L;
  }

  @Override
  public long getContext() {
    return context;
  }

  @Override
  public long getDurationMs() {
    if (stopTime <= 0L) {
      return now() - startedAt;
    }
    return stopTime - startedAt;
  }
}
