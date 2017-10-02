package riskModels.country;

import java.util.HashMap;
import java.util.List;


public class Country {
	public String countryName;
	public int startPixel;  
	public int endPixel;
	public String belongsToContinet;// to Represent county belongs to which continent 
	public List<Country> neighborNodes; // to Represents adjacent country nodes
	
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
	public String getBelongsToContinet() {
		return belongsToContinet;
	}
	public void setBelongsToContinet(String belongsToContinet) {
		this.belongsToContinet = belongsToContinet;
	}
	public List<Country> getNeighborNodes() {
		return neighborNodes;
	}
	public void setNeighborNodes(List<Country> neighborNodes) {
		this.neighborNodes = neighborNodes;
	}
	
	
	

}