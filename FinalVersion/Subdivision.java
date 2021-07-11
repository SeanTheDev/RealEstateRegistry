//Team Hotel
//Subdivision Class

import java.util.ArrayList;
import java.util.Collections;

public class Subdivision {
    private ArrayList<House> houses = new ArrayList<House>();
    private ArrayList<House> housesByArea = new ArrayList<House>();
    private ArrayList<House> housesByPlot = new ArrayList<House>();


    public Subdivision() {
    }    
    public boolean add(House h) {
    	return houses.add(h);
    }
    public House get(int i) {
    	return houses.get(i);
    }
    public ArrayList<House> list() {
    	return houses;
    }
    public int size() {
    	return houses.size();
    }
    public House find(String target) {
    	for (int i = 0; i<houses.size();) {
    		House test = houses.get(i);
    		if (test.getStyle() == target) {
    			return houses.get(i);
    		} else {
    			return null;
    		}
    	}
		return null;
    }
    public ArrayList<House> listByArea(double floor, double ceiling) {
    	for (int i=0; i<houses.size(); i++) {
    		if ((houses.get(i).getTotalArea() >= floor) && (houses.get(i).getTotalArea() <= ceiling))
    			housesByArea.add(houses.get(i));
    	}
    	return housesByArea;
    }
    public ArrayList<House> listByPlot(double floor, double ceiling)  {
    	for (int i=0; i<houses.size(); i++) {
    		if ((houses.get(i).getPlot() >= floor) && (houses.get(i).getPlot() <= ceiling))
    			housesByPlot.add(houses.get(i));
    	}
    	return housesByPlot;
    }
    public ArrayList<House> sortByArea() {

    	for (int i = 0; i < houses.size(); i++) {
    	      // Find the minimum in the list[i..list.length-1]
    	      double currentMin = houses.get(i).getTotalArea();
    	      int currentMinIndex = i;

    	      for (int j = i + 1; j < houses.size(); j++) {
    	        if (currentMin > houses.get(j).getTotalArea()) {
    	        	currentMin = houses.get(j).getTotalArea();
    	            currentMinIndex = j;
    	        }
    	      }
    	      // Swap list[i] with list[currentMinIndex] if necessary;
    	      Collections.swap(houses, i, currentMinIndex);
    	      }
    	    return houses;  
    	    }

    	   	
    public ArrayList<House> sortByPlot() {
    	for (int i = 0; i < houses.size(); i++) {
  	      // Find the minimum in the list[i..list.length-1]
  	      double currentMin = houses.get(i).getPlot();
  	      int currentMinIndex = i;

  	      for (int j = i + 1; j < houses.size(); j++) {
  	        if (currentMin > houses.get(j).getPlot()) {
  	        	currentMin = houses.get(j).getPlot();
  	            currentMinIndex = j;
  	        }
  	      }
  	      // Swap list[i] with list[currentMinIndex] if necessary;
  	      Collections.swap(houses, i, currentMinIndex);
  	      }
  	    return houses;  
  	    }
	}


