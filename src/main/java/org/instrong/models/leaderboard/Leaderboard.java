package org.instrong.models.leaderboard;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.instrong.models.players.LeaderboardPlayer;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Leaderboard {

    private long lastUpdate;
    private long nextUpdate;
    private int totalPlayers;
    private int radiantThreshold;
    private int immortal_3_threshold;
    private int immortal_2_threshold;
    private int immortal_1_threshold;
    private List<LeaderboardPlayer> players;

    public long getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(long lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public long getNextUpdate() {
        return nextUpdate;
    }

    public void setNextUpdate(long nextUpdate) {
        this.nextUpdate = nextUpdate;
    }

    public int getTotalPlayers() {
        return totalPlayers;
    }

    public void setTotalPlayers(int totalPlayers) {
        this.totalPlayers = totalPlayers;
    }

    public int getRadiantThreshold() {
        return radiantThreshold;
    }

    public void setRadiantThreshold(int radiantThreshold) {
        this.radiantThreshold = radiantThreshold;
    }

    public int getImmortal_3_threshold() {
        return immortal_3_threshold;
    }

    public void setImmortal_3_threshold(int immortal_3_threshold) {
        this.immortal_3_threshold = immortal_3_threshold;
    }

    public int getImmortal_2_threshold() {
        return immortal_2_threshold;
    }

    public void setImmortal_2_threshold(int immortal_2_threshold) {
        this.immortal_2_threshold = immortal_2_threshold;
    }

    public int getImmortal_1_threshold() {
        return immortal_1_threshold;
    }

    public void setImmortal_1_threshold(int immortal_1_threshold) {
        this.immortal_1_threshold = immortal_1_threshold;
    }

    public List<LeaderboardPlayer> getPlayers() {
        return players;
    }

    public void setPlayers(List<LeaderboardPlayer> players) {
        this.players = players;
    }
}
