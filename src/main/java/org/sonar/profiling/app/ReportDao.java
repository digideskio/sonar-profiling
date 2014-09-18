package org.sonar.profiling.app;

import org.sonar.profiling.Profiler;
import org.sonar.profiling.Profilers;
import org.sonar.profiling.streamers.SysoutPrinter;

public class ReportDao {
  public void findReport(final String report) {
    Profiler profiler = Profilers.start("cat", "dao");
    SysoutPrinter.print("DAO - Report - find: " + report);
    try {
      Thread.sleep(100L);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    profiler.stop();
  }

  public void persistReport(final String aggregatedReport) {
    Profiler profiler = Profilers.start("cat", "dao");
    SysoutPrinter.print("DAO - Report - persist: " + aggregatedReport);
    try {
      Thread.sleep(100L);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    profiler.stop();
  }
}
