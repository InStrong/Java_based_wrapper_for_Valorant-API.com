package org.instrong.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Region {

    EUROPE("eu"),
    NORTH_AMERICA("na"),
    ASIA_PACIFIC("ap"),
    KOREA("kr");

    private final String name;

    Region(String name) {
        this.name = name;
    }

    @JsonValue
    public String getName() {
        return name;
    }
}
