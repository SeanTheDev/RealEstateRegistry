import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	    int choice;
	    Subdivision subdivision = new Subdivision();
	    subdivision.fromDisk();
	    
	    do
	      {
	        System.out.println ("[0] to Exit");
	        System.out.println ("[1] Display all houses in the Subdivision");
	        System.out.println ("[2] Add a House to the Subdivision");
	        System.out.println ("[3] Delete a House in the Subdivision");
	        System.out.println ("[4] Change a House in the Subdivision");
	        System.out.println ("[5] Filter Subdivision by Total Area and Display");
	        System.out.println ("[6] Filter Subdivision by Plot Size and Display");
	        System.out.println ("[7] Sort Subdivision by Total Area and Display");
	        System.out.println ("[8] Sort Subdivision by Plot Size and Display");
	        System.out.println ("[9] Save Subdivision to Text File");
	        System.out.println ("Enter a number from 0 to 9 : ");
	        
	        choice = input.nextInt ();
	        
	        if (choice == 0)
	          {
	            System.out.println ("You selected option 0");
	            System.out.println ("Goodbye!");

	          }
	        else if (choice == 1)
	          {
	            System.out.println (subdivision.list());
	          }
	        else if (choice == 2)
	          {
	            System.out.println ("Enter the House values as follows: ");
	            
	            System.out.println("House Style: ");
	            String houseStyle = input.next();
	            		
	            System.out.println("Family Room Area: ");
	            double familyRoomArea = input.nextDouble();
	            
	            System.out.println("Living Room Area: ");
	            double livingRoomArea = input.nextDouble();
	            
	            System.out.println("Number of Bedrooms: ");
	            int numberOfBedrooms = input.nextInt();
	            
	            System.out.println("Plot Area: ");
	            double plotArea = input.nextDouble();
	            
	            House newHouse = new House(houseStyle, familyRoomArea, livingRoomArea, numberOfBedrooms, plotArea);
	            subdivision.add(newHouse);
	          }
	        else if (choice == 3)
	          {
	            System.out.println ("Enter the position of the house to be deleted: ");
	            int delete = input.nextInt();
	            subdivision.remove(delete);
	          }
	        else if (choice == 4)
	          {
	            System.out.println ("Enter the position of the house to be changed: ");
	            int index = input.nextInt();
	            
	            System.out.println("Enter the new style of the house: ");
	            String newStyle = input.nextLine();
	            
	            subdivision.get(index).setStyle(newStyle);
	          }
	        else if (choice == 5)
	          {
	            System.out.println ("Enter minimum area: ");
	            double min = input.nextDouble();
	            System.out.println ("Enter maximum area: ");
	            double max = input.nextDouble();
	            
	            System.out.println(subdivision.listByArea(min, max));
	          }
	        else if (choice == 6) {
	        	System.out.println ("Enter minimum plot size: ");
	            double min = input.nextDouble();
	            System.out.println ("Enter maximum plot size: ");
	            double max = input.nextDouble();
	            
	            System.out.println(subdivision.listByPlot(min, max));
	        }	        
	        else if (choice == 7) {
	        	System.out.println(subdivision.sortByArea());
	        }
	        else if (choice == 8) {
	        	System.out.println(subdivision.sortByPlot());
	        }
	        else if (choice == 9) {
	        	subdivision.toDisk();
	        }
	        else
	          {
	            System.out.println ("Wrong Selection !!");
	          }
	     }
	    while (choice!=0);
	    input.close();
	}
	
}
