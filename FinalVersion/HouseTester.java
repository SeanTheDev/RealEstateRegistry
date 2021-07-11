//Team HOTEL
//House Class Tester

public class HouseTester {
	public static void main(String[] args) {
		
		//initialize 3 seperate instances of House
		House house1 = new House("style1", 525.0, 250.0, 4, 6500.0);
		House house2 = new House("style2", 650.0, 300.0, 5, 7500.0);
		House house3 = new House("style3", 650.0, 300.0, 5, 7500.0);

		//Check Style values
		System.out.println("House 1 " + house1.getStyle());
		System.out.println("House 2 " + house2.getStyle());
		
		
		//Check total area for evaluation of comparison accuracy
		System.out.println("House 1 " + house1.getTotalArea());
		System.out.println("House 2 " + house2.getTotalArea());
		System.out.println("House 3 " + house3.getTotalArea());

		//check comparison operator against previous area values
		System.out.println("Comparison house1 vs house2 " + house1.compareArea(house2));
		System.out.println("Comparison house2 vs house1 " + house2.compareArea(house1));
		System.out.println("Comparison house2 vs house3 " + house2.compareArea(house3));
		
		//return individual attributes to confirm initialization
		System.out.println(house1.toString());
		System.out.println(house2.toString());
		System.out.println(house3.toString());


	}
}
