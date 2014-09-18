package org.sonar.profiling;

import java.util.Map;

class Formatter {

  static String format(Profiler profiler) {
    StringBuilder sb = new StringBuilder();
    sb.append("dt=");
    sb.append(profiler.getStartedAt());
    sb.append(", ctx=");
    sb.append(profiler.getContext());
    sb.append(", dur=");
    sb.append(profiler.getDurationMs());
    for (Map.Entry<String, Object> entry : profiler.getFields().entrySet()) {
      sb.append(", ");
      sb.append(entry.getKey());
      sb.append("=");

      Object val = entry.getValue();
      if (val != null) {
        // TODO escape
        sb.append(val.toString());
      }
    }
    return sb.toString();
  }
}
