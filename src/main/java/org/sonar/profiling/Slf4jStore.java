package org.sonar.profiling;

import org.slf4j.Logger;

public class Slf4jStore extends BaseStore {

  private final Logger logger;

  public Slf4jStore(Logger logger) {
    this.logger = logger;
  }

  @Override
  protected void doStore(String log) {

  }


}
