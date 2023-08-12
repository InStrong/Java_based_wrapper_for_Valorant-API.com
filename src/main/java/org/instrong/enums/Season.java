package org.instrong.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Season {

    EPISODE_1_ACT_1("e1a1"),
    EPISODE_1_ACT_2("e1a2"),
    EPISODE_1_ACT_3("e1a3"),
    EPISODE_2_ACT_1("e2a1"),
    EPISODE_2_ACT_2("e2a2"),
    EPISODE_2_ACT_3("e2a3"),
    EPISODE_3_ACT_1("e3a1"),
    EPISODE_3_ACT_2("e3a2"),
    EPISODE_3_ACT_3("e3a3"),
    EPISODE_4_ACT_1("e4a1"),
    EPISODE_4_ACT_2("e4a2"),
    EPISODE_4_ACT_3("e4a3"),
    EPISODE_5_ACT_1("e5a1"),
    EPISODE_5_ACT_2("e5a2"),
    EPISODE_5_ACT_3("e5a3"),
    EPISODE_6_ACT_1("e6a1"),
    EPISODE_6_ACT_2("e6a2"),
    EPISODE_6_ACT_3("e6a3"),
    EPISODE_7_ACT_1("e7a1"),
    EPISODE_7_ACT_2("e7a2"),
    EPISODE_7_ACT_3("e7a3");


    private final String name;

    Season(String name) {
        this.name = name;
    }

    @JsonValue
    public String getName() {
        return name;
    }
}
