package org.sonar.profiling.app;

import org.sonar.profiling.streamers.SysoutPrinter;

public class ReportComputation {
    public void compute(final String report) {
        SysoutPrinter.print("Compute report: " + report);
    }
}
