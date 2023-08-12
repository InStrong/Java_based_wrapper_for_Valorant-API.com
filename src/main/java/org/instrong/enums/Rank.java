package org.instrong.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Rank {
    RADIANT(27),
    IMMORTAL_3(26),
    IMMORTAL_2(25),
    IMMORTAL_1(24),
    ASCENDANT_3(23),
    ASCENDANT_2(22),
    ASCENDANT_1(21),
    DIAMOND_3(20),
    DIAMOND_2(19),
    DIAMOND_1(18),
    PLATINUM_3(17),
    PLATINUM_2(16),
    PLATINUM_1(15),
    GOLD_3(14),
    GOLD_2(13),
    GOLD_1(12),
    SILVER_3(11),
    SILVER_2(10),
    SILVER_1(9),
    BRONZE_3(8),
    BRONZE_2(7),
    BRONZE_1(6),
    IRON_3(5),
    IRON_2(4),
    IRON_1(3),
    UNUSED_2(2),
    UNUSED_1(1),
    UNRANKED(0);

    private final int id;

    Rank(int id) {
        this.id = id;
    }

    @JsonValue
    public int getId() {
        return id;
    }
}
