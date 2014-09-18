package org.sonar.profiling.app;

import org.sonar.profiling.aspects.Profiled;

public class Ldap {
  @Profiled
  public void search(final String user) {
    SysoutPrinter.print("LDAP: " + user);
  }
}
