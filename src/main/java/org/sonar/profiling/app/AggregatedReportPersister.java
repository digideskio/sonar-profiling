package org.sonar.profiling.app;

public class AggregatedReportPersister {
    private final ReportDao dao = new ReportDao();

    public void persist(final String aggregatedReport) {
        System.out.println("AggregatedReport: " + aggregatedReport);
        dao.persistReport(aggregatedReport);
    }
}
