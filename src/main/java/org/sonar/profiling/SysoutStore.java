package org.sonar.profiling;

public class SysoutStore extends BaseStore {

  @Override
  protected void doStore(String log) {
    System.out.println(log);
  }
}
