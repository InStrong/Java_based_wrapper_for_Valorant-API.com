package org.instrong.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Locale {
    ARABIC("ar-AE"),
    GERMAN("de-DE"),
    ENGLISH_UK("en-GB"),
    ENGLISH_US("en-US"),
    SPANISH_SPAIN("es-ES"),
    SPANISH_MEXICO("es-MX"),
    FRENCH("fr-FR"),
    INDONESIAN("id-ID"),
    ITALIAN("it-IT"),
    JAPANESE("ja-JP"),
    KOREAN("ko-KR"),
    POLISH("pl-PL"),
    PORTUGUESE_BRAZIL("pt-BR"),
    RUSSIAN("ru-RU"),
    THAI("th-TH"),
    TURKISH("tr-TR"),
    VIETNAMESE("vi-VN"),
    CHINESE_PRC("zh-CN"),
    CHINESE_TAIWAN("zh-TW");

    private final String name;

    Locale(String name) {
        this.name = name;
    }

    @JsonValue
    public String getName() {
        return name;
    }
}
