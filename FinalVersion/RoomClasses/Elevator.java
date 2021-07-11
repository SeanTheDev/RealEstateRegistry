//Team HOTEL
//Elevator Class

public class Elevator extends Room {
	private int currentFloor;
	
	//constructore based of Room Class
	public Elevator(int area) {
		super(area);
	}
	
	//accessor method
	public int getFloor() {
		return currentFloor;
	}
	
	//mutator methods
	public void up(int floors) {
		this.currentFloor += floors;
	}
	public void down(int floors) {
		this.currentFloor -= floors;
	}
	
	//override of toString method unique to elevator
	@Override
	public String toString() {
		return "SquareFeet: " + 
				this.getSquareFeet() + 
				"Capacity: " + 
				this.getCapacity() + 
				"CurrentFloor: " +
				this.getFloor();

	}
}
