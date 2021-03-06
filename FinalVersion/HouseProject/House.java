//Team HOTEL
//House Class

public class House {
	
	//declare local variables
	private int numberOfBedrooms;
	private double familyRoomArea;
	private double livingRoomArea;
	private String houseStyle;
	private double plotArea;
	private final static double bedroomArea = 300;
	
	//no-arg constructor
	public House() {
	}
	
	//constructor with parameters
	public House(String houseStyle, double familyRoomArea, double livingRoomArea, int numberOfBedrooms, double plotArea) {
		this.houseStyle = houseStyle;
		this.familyRoomArea = familyRoomArea;
		this.livingRoomArea = livingRoomArea;
		this.numberOfBedrooms = numberOfBedrooms;
		this.plotArea = plotArea;
	}
	
	//Accessor methods
	public int getBedrooms() {
		return numberOfBedrooms;
	}
	public double getFamilyRoomArea() {
		return familyRoomArea;
	}
	public double getLivingRoomArea() {
		return livingRoomArea;
	}
	public double getPlot() {
		return plotArea;
	}
	public String getStyle() {
		return houseStyle;
	}
	public double getTotalArea() {
		return (numberOfBedrooms * bedroomArea) + familyRoomArea + livingRoomArea;
	}
	
	//Comparison Method
	public int compareArea(House otherHouse) {
		if (otherHouse.getTotalArea() > this.getTotalArea())
			return -1;
		else if (otherHouse.getTotalArea() < this.getTotalArea())
			return 1;
		else
			return 0;
	}
	
	//Returns House attributes
	public String toString() {
		return "House Style = " + getStyle() +
		" Bedrooms = " + getBedrooms() +
		" FamilyRoom Area = " + getFamilyRoomArea() +
		" LivingRoom Area = " + getLivingRoomArea() +
		" Plot = " + getPlot() +
		" Square Feet = " + getTotalArea();
	}
	
	//Mutator Methods
	public void setBedrooms(int newNumberOfBedrooms) {
		this.numberOfBedrooms = newNumberOfBedrooms;
	}
	public void setFamilyRoomArea(double newFamilyRoomArea) {
		this.familyRoomArea = newFamilyRoomArea;
	}
	public void setLivingRoomArea(double newLivingRoomArea) {
		this.livingRoomArea = newLivingRoomArea;
	}
	public void setPlot(double newPlotArea) {
		this.plotArea = newPlotArea;
	}
	public void setStyle(String newHouseStyle) {
		this.houseStyle = newHouseStyle;
	}
}
