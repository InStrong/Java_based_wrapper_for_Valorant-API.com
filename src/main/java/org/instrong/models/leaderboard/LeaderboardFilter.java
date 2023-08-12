package org.instrong.models.leaderboard;

import org.instrong.enums.Region;
import org.instrong.enums.Season;

import java.util.UUID;

/**
 * Filters data from /v2/leaderboard endpoint
 * Note that if username + tag or puuid is set response will not contain {@link Leaderboard} fields except list of {@link org.instrong.models.players.LeaderboardPlayer}
 * with filtered player
 *
 * <br>
 * Currently {@link Season} = e1a1 does not work, consider it!
 */

public class LeaderboardFilter {
    Region region;
    UUID puuid;
    String username;
    String tag;
    Season season;

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public UUID getPuuid() {
        return puuid;
    }

    public void setPuuid(UUID puuid) {
        this.puuid = puuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
