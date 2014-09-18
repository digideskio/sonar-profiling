package org.sonar.profiling.app;

import org.sonar.profiling.aspects.Profiled;

public class ReportDao {
  @Profiled
  public void findReport(final String report) {
    SysoutPrinter.print("DAO - Report - find: " + report);
  }

  @Profiled
  public void persistReport(final String aggregatedReport) {
    SysoutPrinter.print("DAO - Report - persist: " + aggregatedReport);
  }
}
