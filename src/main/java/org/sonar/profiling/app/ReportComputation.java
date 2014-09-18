package org.sonar.profiling.app;

import org.sonar.profiling.aspects.Profiled;

public class ReportComputation {
  @Profiled
  public void compute(final String report) {
    SysoutPrinter.print("Compute report: " + report);
  }
}
