public class Elevator extends Room {
	private int currentFloor;
	
	public Elevator(int area) {
		super(area);
	}
	public int getFloor() {
		return currentFloor;
	}
	public void up(int floors) {
		this.currentFloor += floors;
	}
	public void down(int floors) {
		this.currentFloor -= floors;
	}
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
