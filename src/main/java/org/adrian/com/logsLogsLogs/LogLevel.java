package org.adrian.com.logsLogsLogs;

public enum LogLevel {
    TRACE("TRC", 1),
    DEBUG("DBG", 2),
    INFO("INF", 4),
    WARNING("WRN", 5),
    ERROR("ERR", 6),
    FATAL("FTL", 42),
    UNKNOWN("", 0);

    private final String symbol;
    public final int shortLog;

    LogLevel(String symbol, int shortLog) {
        this.symbol = symbol;
        this.shortLog = shortLog;
    }

    public static LogLevel fromSymbol(String symbol) {
        for (LogLevel logLevel : values()) {
            if (symbol.contains(logLevel.symbol)) {
                return logLevel;
            }
        }
        return LogLevel.UNKNOWN;
    }
}
