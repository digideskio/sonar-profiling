package org.sonar.profiling;

import javax.annotation.CheckForNull;
import javax.annotation.Nullable;

import java.util.Map;

public interface Profiler {

  void stop();

  @CheckForNull
  Object getField(String key);
  
  Map<String,Object> getFields();

  Profiler setField(String key, @Nullable Object value);

  long getContext();

  boolean isStopped();

  Profiler setTextField(String key, String value);

  Profiler setFields(Object... keyValues);

  long getStartedAt();

  long getDurationMs();
}
