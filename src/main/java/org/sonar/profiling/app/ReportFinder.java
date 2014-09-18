package org.sonar.profiling.app;

import org.sonar.profiling.streamers.SysoutPrinter;

public class ReportFinder {
    private final ReportDao dao = new ReportDao();

    public void findReport(final String report) {
        SysoutPrinter.print("ReportFinder: " + report);
        dao.findReport(report);
    }
}
