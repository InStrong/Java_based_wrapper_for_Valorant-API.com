package org.instrong.models.content;

import java.util.List;

public class Content {

    private String version;
    private List<ContentObject> characters;
    private List<ContentObjectWithAssetPath> maps;
    private List<ContentObject> chromas;
    private List<ContentObject> skins;
    private List<ContentObject> skinLevels;
    private List<ContentObject> equips;
    private List<ContentObjectWithAssetPath> gameModes;
    private List<ContentObject> sprays;
    private List<ContentObject> sprayLevels;
    private List<ContentObject> charms;
    private List<ContentObject> charmLevels;
    private List<ContentObject> playerCards;
    private List<ContentObject> playerTitles;
    private List<ContentAct> acts;
    private List<ContentObject> ceremonies;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<ContentObject> getCharacters() {
        return characters;
    }

    public void setCharacters(List<ContentObject> characters) {
        this.characters = characters;
    }

    public List<ContentObjectWithAssetPath> getMaps() {
        return maps;
    }

    public void setMaps(List<ContentObjectWithAssetPath> maps) {
        this.maps = maps;
    }

    public List<ContentObject> getChromas() {
        return chromas;
    }

    public void setChromas(List<ContentObject> chromas) {
        this.chromas = chromas;
    }

    public List<ContentObject> getSkins() {
        return skins;
    }

    public void setSkins(List<ContentObject> skins) {
        this.skins = skins;
    }

    public List<ContentObject> getSkinLevels() {
        return skinLevels;
    }

    public void setSkinLevels(List<ContentObject> skinLevels) {
        this.skinLevels = skinLevels;
    }

    public List<ContentObject> getEquips() {
        return equips;
    }

    public void setEquips(List<ContentObject> equips) {
        this.equips = equips;
    }

    public List<ContentObjectWithAssetPath> getGameModes() {
        return gameModes;
    }

    public void setGameModes(List<ContentObjectWithAssetPath> gameModes) {
        this.gameModes = gameModes;
    }

    public List<ContentObject> getSprays() {
        return sprays;
    }

    public void setSprays(List<ContentObject> sprays) {
        this.sprays = sprays;
    }

    public List<ContentObject> getSprayLevels() {
        return sprayLevels;
    }

    public void setSprayLevels(List<ContentObject> sprayLevels) {
        this.sprayLevels = sprayLevels;
    }

    public List<ContentObject> getCharms() {
        return charms;
    }

    public void setCharms(List<ContentObject> charms) {
        this.charms = charms;
    }

    public List<ContentObject> getCharmLevels() {
        return charmLevels;
    }

    public void setCharmLevels(List<ContentObject> charmLevels) {
        this.charmLevels = charmLevels;
    }

    public List<ContentObject> getPlayerCards() {
        return playerCards;
    }

    public void setPlayerCards(List<ContentObject> playerCards) {
        this.playerCards = playerCards;
    }

    public List<ContentObject> getPlayerTitles() {
        return playerTitles;
    }

    public void setPlayerTitles(List<ContentObject> playerTitles) {
        this.playerTitles = playerTitles;
    }

    public List<ContentAct> getActs() {
        return acts;
    }

    public void setActs(List<ContentAct> acts) {
        this.acts = acts;
    }

    public List<ContentObject> getCeremonies() {
        return ceremonies;
    }

    public void setCeremonies(List<ContentObject> ceremonies) {
        this.ceremonies = ceremonies;
    }
}
