package org.instrong.models.players;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.instrong.enums.Rank;

import java.util.UUID;

public class LeaderboardPlayer {
    private String gameName;
    private String tagLine;
    private UUID puuid;
    @JsonProperty("PlayerCardID")
    private String playerCardId;
    @JsonProperty("TitleID")
    private String titleId;
    @JsonProperty("IsBanned")
    private boolean isBanned;
    @JsonProperty("IsAnonymized")
    private boolean isAnonymized;
    private int leaderboardRank;
    private int rankedRating;
    private int numberOfWins;
    private Rank competitiveTier;

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getTagLine() {
        return tagLine;
    }

    public void setTagLine(String tagLine) {
        this.tagLine = tagLine;
    }

    public UUID getPuuid() {
        return puuid;
    }

    public void setPuuid(UUID puuid) {
        this.puuid = puuid;
    }

    public String getPlayerCardId() {
        return playerCardId;
    }

    public void setPlayerCardId(String playerCardId) {
        this.playerCardId = playerCardId;
    }

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }

    public boolean isBanned() {
        return isBanned;
    }

    public void setBanned(boolean banned) {
        isBanned = banned;
    }

    public boolean isAnonymized() {
        return isAnonymized;
    }

    public void setAnonymized(boolean anonymized) {
        isAnonymized = anonymized;
    }

    public int getLeaderboardRank() {
        return leaderboardRank;
    }

    public void setLeaderboardRank(int leaderboardRank) {
        this.leaderboardRank = leaderboardRank;
    }

    public int getRankedRating() {
        return rankedRating;
    }

    public void setRankedRating(int rankedRating) {
        this.rankedRating = rankedRating;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }

    public Rank getCompetitiveTier() {
        return competitiveTier;
    }

    public void setCompetitiveTier(Rank competitiveTier) {
        this.competitiveTier = competitiveTier;
    }
}
