package org.instrong.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.instrong.Utils.HttpUtils;
import org.instrong.enums.Locale;
import org.instrong.exceptions.IncorrectDataException;
import org.instrong.models.content.Content;

import java.io.IOException;

public final class ContentService {

    private static ContentService INSTANCE;

    private ContentService() {
    }

    public static ContentService getInstance() {
        if (INSTANCE == null) {
            return new ContentService();
        }
        return INSTANCE;
    }

    public Content getContent(Locale locale) throws IOException {
        if (locale == null) {
            throw new IncorrectDataException("Locale is required");
        }
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        String rawResponse = HttpUtils.sendRestRequestString("/v1/content?locale=" + locale.getName());
        return mapper.readValue(rawResponse, Content.class);
    }
}
