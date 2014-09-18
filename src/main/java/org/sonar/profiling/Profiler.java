package org.sonar.profiling;

import javax.annotation.CheckForNull;
import java.util.Map;

public interface Profiler {

  void stop();

  @CheckForNull
  Object getField(String key);
  
  Map<String,Object> getFields();

  Profiler setField(String key, Object value);

  Profiler setTextField(String key, String value);

  long getContext();

  boolean isStopped();

  Profiler setFields(Object... keyValues);

  long getStartedAt();

  long getDurationMs();
}
