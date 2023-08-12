package org.instrong.Utils;

import org.instrong.exceptions.FetchException;
import org.instrong.exceptions.IncorrectDataException;
import org.instrong.exceptions.InvalidAuthenticationException;
import org.instrong.exceptions.RateLimitedException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtils {

    public static String sendRestRequestString(String uriPath) throws IOException {
        ValorantApi valorantApi = ValorantApi.getInstance();
        String apiKey = valorantApi.getApiKey();
        URL baseUrl = valorantApi.getBaseUrl();

        HttpURLConnection connection = (HttpURLConnection) new URL(baseUrl + uriPath).openConnection();

        connection.setRequestProperty("Authorization", apiKey);
        connection.setRequestProperty("User-Agent", "Java Valorant API (JVA)");
        connection.setDoInput(true);

        switch (connection.getResponseCode()) {
            case 200 -> {
            }
            case 403 -> throw new InvalidAuthenticationException(connection.getResponseMessage());
            case 404 -> throw new IncorrectDataException(connection.getResponseMessage());
            case 429 -> throw new RateLimitedException(connection.getResponseMessage());
            default ->
                    throw new FetchException("Rest API returned unknown error code: " + connection.getResponseMessage());
        }

        StringBuilder builder = new StringBuilder();

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String msg;

        while ((msg = reader.readLine()) != null) {
            builder.append(msg).append("\n");
        }

        return builder.toString();
    }
}
