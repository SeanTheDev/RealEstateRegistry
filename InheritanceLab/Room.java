public class Room {
	private int area;
	
	public Room() {
	}
	public Room(int area) {
		this.area = area;
	}
	public int getSquareFeet() {
		return area;
	}
	public void setSquareFeet(int area) {
		this.area = area;
	}
	public int getCapacity() {
		return area/9;
	}
	public String toString() {
		return "SquareFeet: " + area + "Capacity: " + this.getCapacity();
	}
}
