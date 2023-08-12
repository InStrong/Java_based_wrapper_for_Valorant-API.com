package org.instrong.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.instrong.Utils.HttpUtils;
import org.instrong.exceptions.IncorrectDataException;
import org.instrong.models.RestResponse;
import org.instrong.models.leaderboard.Leaderboard;
import org.instrong.models.leaderboard.LeaderboardFilter;
import org.instrong.models.players.LeaderboardPlayer;

import java.io.IOException;
import java.util.List;

public final class LeaderboardService {

    private static LeaderboardService INSTANCE;

    private LeaderboardService() {
    }

    public static LeaderboardService getInstance() {
        if (INSTANCE == null) {
            return new LeaderboardService();
        }
        return INSTANCE;
    }

    public Leaderboard getLeaderboard(LeaderboardFilter filter) throws IOException {
        if (filter == null || filter.getRegion() == null) {
            throw new IncorrectDataException("Region is required");
        }
        if (filter.getPuuid() != null && (filter.getUsername() != null || filter.getTag() != null)) {
            throw new IncorrectDataException("You can only filter by puuid or name and tag, both at the same time is logically not possible");
        }
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        String rawResponse = HttpUtils.sendRestRequestString(buildUriWithFilters(filter));
        if (filter.getUsername() != null || filter.getPuuid() != null) {
            Leaderboard leaderboard = new Leaderboard();
            RestResponse restResponse = mapper.readValue(rawResponse, RestResponse.class);
            LeaderboardPlayer[] players = mapper.convertValue(restResponse.getData(), LeaderboardPlayer[].class);
            leaderboard.setPlayers(List.of(players));
            return leaderboard;
        }
        return mapper.readValue(rawResponse, Leaderboard.class);
    }

    private String buildUriWithFilters(LeaderboardFilter filter) {
        StringBuilder uriPath = new StringBuilder("/v2/leaderboard/");
        uriPath.append(filter.getRegion().getName());
        uriPath.append("?");
        if (filter.getPuuid() != null) {
            uriPath.append("puuid=").append(filter.getPuuid().toString());
        }
        if (filter.getUsername() != null && filter.getTag() != null) {
            uriPath.append("name=").append(filter.getUsername()).append("&tag=").append(filter.getTag());
        }
        if (filter.getSeason() != null) {
            uriPath.append("&season=").append(filter.getSeason().getName());
        }
        return uriPath.toString();
    }
}
