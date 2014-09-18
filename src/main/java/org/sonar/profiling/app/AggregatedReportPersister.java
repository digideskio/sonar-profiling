package org.sonar.profiling.app;

import org.sonar.profiling.aspects.Profiled;

public class AggregatedReportPersister {
  private final ReportDao dao = new ReportDao();

  @Profiled
  public void persist(final String aggregatedReport) {
    SysoutPrinter.print("AggregatedReport: " + aggregatedReport);
    dao.persistReport(aggregatedReport);
  }
}
