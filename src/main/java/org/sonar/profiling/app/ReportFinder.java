package org.sonar.profiling.app;

import org.sonar.profiling.aspects.Profiled;

public class ReportFinder {
  private final ReportDao dao = new ReportDao();

  @Profiled
  public void findReport(final String report) {
    SysoutPrinter.print("ReportFinder: " + report);
    dao.findReport(report);
  }
}
