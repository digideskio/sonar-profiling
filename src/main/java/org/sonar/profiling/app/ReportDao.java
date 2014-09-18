package org.sonar.profiling.app;

import org.sonar.profiling.streamers.SysoutPrinter;

public class ReportDao {
    public void findReport(final String report) {
        SysoutPrinter.print("DAO - Report - find: " + report);
    }

    public void persistReport(final String aggregatedReport) {
        SysoutPrinter.print("DAO - Report - persist: " + aggregatedReport);
    }
}
