//Team HOTEL
//Room Class

public class Room {
	private int area;
	
	//no arg constructor
	public Room() {
	}
	
	//constructor
	public Room(int area) {
		this.area = area;
	}
	
	//accessor methods
	public int getSquareFeet() {
		return area;
	}
	public int getCapacity() {
		return area/9;
	}
	
	//mutator methods
	public void setSquareFeet(int area) {
		this.area = area;
	}
	public String toString() {
		return "SquareFeet: " + area + "Capacity: " + this.getCapacity();
	}
}
