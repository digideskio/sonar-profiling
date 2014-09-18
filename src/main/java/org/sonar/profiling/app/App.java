package org.sonar.profiling.app;

public class App {
    private final Authentication auth = new Authentication();
    private final ReportFinder reportFinder = new ReportFinder();
    private final ReportComputation reportComputation = new ReportComputation();
    private final AggregatedReportPersister reportPersister = new AggregatedReportPersister();

    /**
     * @param args
     */
    public void launch() {
        auth.auth("User 1");
        reportFinder.findReport("Report 1");
        reportComputation.compute("Report 1");
        reportPersister.persist("aggregatedReport 1");
    }

    public static void main(final String[] args) {
        App app = new App();
        app.launch();
    }

}
