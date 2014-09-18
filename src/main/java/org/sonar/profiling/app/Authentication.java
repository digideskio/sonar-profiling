package org.sonar.profiling.app;

import org.sonar.profiling.Profiler;
import org.sonar.profiling.Profilers;
import org.sonar.profiling.streamers.SysoutPrinter;

public class Authentication {
    private final Ldap ldap = new Ldap();

    public void auth(final String user) {
        Profiler profiler = Profilers.start("PUserAuthication");
        SysoutPrinter.print("User authentication: " + user);
        ldap.search(user);
        profiler.stop();
    }
}
