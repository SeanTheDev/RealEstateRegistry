//Team HOTEL
//Classroom Class

public class Classroom extends Room {
	private int numberOfChairs;
	
	//constructors based off Room Class
	public Classroom(int area) {
		super(area);
	}
	public Classroom(int area, int numberOfChairs) {
		super(area);
		this.numberOfChairs = numberOfChairs;
	}
	
	//accessor method
	public int getNumberOfChairs() {
		return numberOfChairs;
	}
	
	//mutator method
	public void setNumberOfChairs(int numberOfChairs) {
		this.numberOfChairs = numberOfChairs;
	}
	
	//override of accessor methods unique to classroom
	@Override
	public int getCapacity() {
		return this.getSquareFeet()/numberOfChairs;
	}
	@Override
	public String toString() {
		return "SquareFeet: " + this.getSquareFeet() + " Capacity: " + this.getNumberOfChairs();

	}
}
