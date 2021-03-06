
package riskModels.map;

import riskModels.continent.Continent;
import riskModels.country.Country;

import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This class holds the properties to create graph from map file
 *
 * @author prashantp95
 */
public class GameMap {

    public HashMap<Country, List<Country>> countryAndNeighborsMap = new HashMap<>();
    public List<Continent> continentList = new ArrayList<>();
    public boolean isCorrectMap =true;
    public String errorMessage;

    public boolean isCorrectMap() {
		return isCorrectMap;
	}

	public void setCorrectMap(boolean isCorrectMap) {
		this.isCorrectMap = isCorrectMap;
	}

	public HashMap<Country, List<Country>> getCountryAndNeighborsMap() {
        return countryAndNeighborsMap;
    }

    public void setCountryAndNeighborsMap(HashMap<Country, List<Country>> countryAndNeighborsMap) {
        this.countryAndNeighborsMap = countryAndNeighborsMap;
    }

    public List<Continent> getContinentList() {
        return continentList;
    }

    public void setContinentList(List<Continent> continentList) {
        this.continentList = continentList;
    }


	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
		
	}
    
}
