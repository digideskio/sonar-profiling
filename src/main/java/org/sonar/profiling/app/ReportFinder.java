package org.sonar.profiling.app;

public class ReportFinder {
    private final ReportDao dao = new ReportDao();

    public void findReport(final String report) {
        System.out.println("ReportFinder: " + report);
        dao.findReport(report);
    }
}
