package org.sonar.profiling;

class Formatter {

  static String format(Profiler profiler) {
    StringBuilder sb = new StringBuilder();
    sb.append("ctx=");
    sb.append("msg=");
    // TODO escape
    sb.append(profiler.getMessage());
    sb.append(", dur=");
    sb.append(profiler.getDurationNs());
    return sb.toString();
  }
}
