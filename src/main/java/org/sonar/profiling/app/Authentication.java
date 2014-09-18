package org.sonar.profiling.app;

import org.sonar.profiling.aspects.Profiled;

public class Authentication {
  private final Ldap ldap = new Ldap();

  @Profiled
  public void auth(final String user) {
    SysoutPrinter.print("User authentication: " + user);
    ldap.search(user);
  }
}
