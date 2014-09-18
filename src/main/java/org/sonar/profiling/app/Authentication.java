package org.sonar.profiling.app;

import org.sonar.profiling.Profiler;
import org.sonar.profiling.Profilers;

public class Authentication {
    private final Ldap ldap = new Ldap();

    public void auth(final String user) {
        Profiler profiler = Profilers.start("cat", "auth");
        SysoutPrinter.print("User authentication: " + user);
        ldap.search(user);
        profiler.stop();
    }
}
