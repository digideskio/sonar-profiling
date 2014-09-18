package org.sonar.profiling.app;

public class ReportDao {
    public void findReport(final String report) {
        System.out.println("DAO - Report - find: " + report);
    }

    public void persistReport(final String aggregatedReport) {
        System.out.println("DAO - Report - persist: " + aggregatedReport);
    }
}
