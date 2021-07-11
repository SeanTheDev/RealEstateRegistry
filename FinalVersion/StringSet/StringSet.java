//Team HOTEL
//StringSet Class

import java.util.ArrayList;

public class StringSet extends ArrayList<String>{
	private ArrayList<String> stringArray;
	
	//constructor
	public StringSet() {		
		stringArray = new ArrayList<String>();
	}
	
	//mutators
	public boolean add(String newStr) {
		if (stringArray.size() > 10)
			return false;
		else
			stringArray.add(newStr);
			return true;
	}
	public void pop() {
		if (stringArray.size() != 0)
			stringArray.remove(stringArray.size() - 1);		
	}
	
	//accessors
	public int size() {
		return stringArray.size();
	}
	public int numChars() {
		int numChars = 0;
		for (int i=0; i<stringArray.size(); i++) {			
			numChars += stringArray.get(i).length();
		}
		return numChars;
	}
	
	//SUbstring Search method
	public int countStrings(String stringToLookFor) {
		int matchCounter = 0;
		for (int i=0; i<stringArray.size(); i++) {
			if (stringArray.get(i).contains(stringToLookFor)) {
				matchCounter++;
			}
		}
		return matchCounter;
	}
}