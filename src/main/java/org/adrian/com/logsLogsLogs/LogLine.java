package org.adrian.com.logsLogsLogs;

public class LogLine {
    private String logLine;
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        return LogLevel.fromSymbol(logLine);
    }

    public String getOutputForShortLog() {
        return LogLevel.fromSymbol(logLine).shortLog + ":" + logLine.substring(logLine.indexOf(":") + 1).trim();
    }
}
