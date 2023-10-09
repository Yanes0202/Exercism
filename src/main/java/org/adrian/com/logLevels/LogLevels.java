package org.adrian.com.logLevels;

public class LogLevels {

    public static String message(String logLine) {
        String[] split = logLine.split("\\[.+\\]:\\s+");
        return split[1].trim();
    }
    public static String logLevel(String logLine) {
        String[] split = logLine.split("\\[|\\]:");
        return split[1].toLowerCase();
    }
    public static String reformat(String logLine) {
        String message = message(logLine);
        String level = logLevel(logLine);
        return message + " (" + level + ")";
    }
}
