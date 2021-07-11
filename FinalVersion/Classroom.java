
public class Classroom extends Room {
	
	private int numberOfChairs;
	
	public Classroom(int area) {
		super(area);
	}
	public Classroom(int area, int numberOfChairs) {
		super(area);
		this.numberOfChairs = numberOfChairs;
	}
	public int getNumberOfChairs() {
		return numberOfChairs;
	}
	public void setNumberOfChairs(int numberOfChairs) {
		this.numberOfChairs = numberOfChairs;
	}
	@Override
	public int getCapacity() {
		return this.getSquareFeet()/numberOfChairs;
	}
	@Override
	public String toString() {
		return "SquareFeet: " + this.getSquareFeet() + " Capacity: " + this.getNumberOfChairs();

	}
}
