//Team HOTEL
//Subdivision Tester

public class SubdivisionTester {

	public static void main(String[] args) {
		
		//generates house using set methods of house class
		House h1 = new House();
		h1.setBedrooms(3);
		h1.setFamilyRoomArea(300.5);
		h1.setLivingRoomArea(180.3);
		h1.setStyle("Ranch");
		h1.setPlot(1.0);		
		
		//generates houses using House class constructor
		//areas and style set for easy identification in lists
		House h2 = new House("ONE", 100, 100, 1, 6);
		House h3 = new House("TWO", 100, 100, 2, 5);
		House h4 = new House("THREE", 100, 100, 3, 4);
		House h5 = new House("FOUR", 100, 100, 4, 3);
		House h6 = new House("FIVE", 100, 100, 5, 2);
		House h7 = new House("SIX", 100, 100, 6, 1);

		//generates subdivision and adds houses in non linear order
		Subdivision subdivision = new Subdivision();
		subdivision.add(h1);
		subdivision.add(h6);
		subdivision.add(h4);
		subdivision.add(h7);
		subdivision.add(h2);
		subdivision.add(h5);
		subdivision.add(h3);

		//return results to test each method
		System.out.println("list method check:");
		System.out.println(subdivision.list());
		
		System.out.println("size method check");
		System.out.println(subdivision.size());
		
		System.out.println("find method check, target 'Ranch':");
		System.out.println(subdivision.find("Ranch"));
		
		System.out.println("get by index method check, target Index=1: ");
		System.out.println(subdivision.get(1));
		
		System.out.println("ToString method check: ");
		System.out.println(subdivision.toString());
		
		System.out.println("filter and return list by area: Range 500-2000 ");
		System.out.println(subdivision.listByArea(500, 2000));
		
		System.out.println("filter and return list by plot size: Range 2-5" );
		System.out.println(subdivision.listByPlot(2, 5));
		
		System.out.println("Sort list by Area: ");
		System.out.println(subdivision.sortByArea());
		
		System.out.println("Sort list by plot size: ");
		System.out.println(subdivision.sortByPlot());
		}

}
