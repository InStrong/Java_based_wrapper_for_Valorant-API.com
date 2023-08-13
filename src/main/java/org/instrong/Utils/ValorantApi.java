package org.instrong.Utils;

import org.instrong.enums.Locale;
import org.instrong.models.content.Content;
import org.instrong.models.leaderboard.Leaderboard;
import org.instrong.models.leaderboard.LeaderboardFilter;
import org.instrong.service.ContentService;
import org.instrong.service.LeaderboardService;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ValorantApi {
    private static ValorantApi valorantApi = null;
    private final String apiKey;
    private final URL baseUrl = new URL("https://api.henrikdev.xyz/valorant");

    private ValorantApi(String apiKey) throws MalformedURLException {
        this.apiKey = apiKey;
    }

    public static ValorantApi getInstance() {
        if (valorantApi == null) {
            throw new AssertionError("Initialize Valorant Api first");
        }
        return valorantApi;
    }

    public synchronized static ValorantApi init(String apiKey) throws MalformedURLException {
        if (valorantApi != null) {
            throw new AssertionError("You already initialized me");
        }

        valorantApi = new ValorantApi(apiKey);
        return valorantApi;
    }

    public String getApiKey() {
        return apiKey;
    }

    public URL getBaseUrl() {
        return baseUrl;
    }

    public Leaderboard getLeaderboard(LeaderboardFilter filter) throws IOException {
        LeaderboardService leaderboardService = LeaderboardService.getInstance();
        return leaderboardService.getLeaderboard(filter);
    }

    public Content getContent(Locale locale) throws IOException {
        ContentService contentService = ContentService.getInstance();
        return contentService.getContent(locale);
    }
}
