package org.sonar.profiling.streamers;

public class SysoutPrinter {
    public static void print(final String message) {
        System.out.println("LOG - " + message);
    }
}
