import java.util.Scanner;

public class StringSetTester {
	public static void main(String[] args) {
		
		//construct StringSet
		StringSet stringSet = new StringSet();
		
		//Take in user input
		Scanner input = new Scanner(System.in);
		System.out.print("How many strings will you enter? ");
		int numStr = input.nextInt();  // stops after the number, leaves end of line or other whitespace
		input.nextLine();              // "eats" everything up to and including the next newline
		 // the next kybd.nextLine() will read user input
		System.out.println("Type a string then press enter to begin typing next string: ");
		 
		//add strings to stringSet
		for (int i=0; i<numStr;) {
			String newStr = input.nextLine();
			stringSet.add(newStr);
			i++;
		}
		
		System.out.println("Your stringSet contains " + stringSet.size() + " strings.");
		System.out.println("Your stringSet contains " + stringSet.numChars() + " total characters.");
		
		System.out.print("Enter a string to search for: ");
		String targetString = input.nextLine();
		System.out.print(stringSet.countStrings(targetString) + " strings in your stringSet contain " + targetString);
		
		input.close();
	}
}
