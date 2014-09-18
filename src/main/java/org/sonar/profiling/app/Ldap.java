package org.sonar.profiling.app;

import org.sonar.profiling.Profiler;
import org.sonar.profiling.Profilers;
import org.sonar.profiling.streamers.SysoutPrinter;

public class Ldap {
  public void search(final String user) {
    Profiler profiler = Profilers.start("cat", "LDAP", "user", user);
    SysoutPrinter.print("LDAP: " + user);
    profiler.stop();
  }
}
