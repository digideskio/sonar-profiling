package org.sonar.profiling.app;

import org.sonar.profiling.Profilers;
import org.sonar.profiling.ThreadLocalContextFactory;

public class App {
  private final Authentication auth = new Authentication();
  private final ReportFinder reportFinder = new ReportFinder();
  private final ReportComputation reportComputation = new ReportComputation();
  private final AggregatedReportPersister reportPersister = new AggregatedReportPersister();

  public void launch() {
    auth.auth("User 1");
    reportFinder.findReport("Report 1");
    reportComputation.compute("Report 1");
    reportPersister.persist("aggregatedReport 1");
  }

  public static void main(final String[] args) {
    Profilers.getRegistry().setContextFactory(new ThreadLocalContextFactory());
    App app = new App();
    app.launch();
  }

}
