package org.sonar.profiling.app;

public class AggregatedReportPersister {
    private final ReportDao dao = new ReportDao();

    public void persist(final String aggregatedReport) {
        SysoutPrinter.print("AggregatedReport: " + aggregatedReport);
        dao.persistReport(aggregatedReport);
    }
}
