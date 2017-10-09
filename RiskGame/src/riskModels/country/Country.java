package riskModels.country;

import java.util.List;

/**
 * Country Bean class to get and set properties related to country
 *
 * @author prashantp95
 */

public class Country {
    public String countryName;
    public int startPixel;
    public int endPixel;
    public String belongsToContinent;// to Represent county belongs to which continent
    public List<Country> neighborNodes; // to Represents adjacent country nodes

    public Country(String countryName, int startPixel, int endPixel, String continentName) {
        this.countryName = countryName;
        this.startPixel = startPixel;
        this.endPixel = endPixel;
        this.belongsToContinent = continentName;
    }

    public Country(String neighbourCountryName) {
        this.countryName = neighbourCountryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getStartPixel() {
        return startPixel;
    }

    public void setStartPixel(int startPixel) {
        this.startPixel = startPixel;
    }

    public int getEndPixel() {
        return endPixel;
    }

    public void setEndPixel(int endPixel) {
        this.endPixel = endPixel;
    }

    public String getBelongsToContinent() {
        return belongsToContinent;
    }

    public void setBelongsToContinent(String belongsToContinent) {
        this.belongsToContinent = belongsToContinent;
    }

    public List<Country> getNeighborNodes() {
        return neighborNodes;
    }

    public void setNeighborNodes(List<Country> neighborNodes) {
        this.neighborNodes = neighborNodes;
    }
}
