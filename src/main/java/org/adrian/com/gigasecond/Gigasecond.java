package org.adrian.com.gigasecond;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
public class Gigasecond {
    LocalDateTime time;

    public Gigasecond(LocalDate moment) {
        this.time = LocalDateTime.from(moment.atStartOfDay(ZoneId.systemDefault()).plusSeconds(1_000_000_000L));
    }
    public Gigasecond(LocalDateTime moment) {
        this.time = moment.plusSeconds(1_000_000_000L);
    }
    public LocalDateTime getDateTime() {
        return time;
    }
}
