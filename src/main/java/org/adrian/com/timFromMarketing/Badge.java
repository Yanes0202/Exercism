package org.adrian.com.timFromMarketing;

public class Badge {

    public String print(Integer id, String name, String department) {
        return "%s%s - %s".formatted(id != null ? "["+ id + "] - " : "", name, department == null ? "OWNER" : department.toUpperCase());
    }
}
