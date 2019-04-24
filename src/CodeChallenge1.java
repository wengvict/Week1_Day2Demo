import java.util.Scanner;

/*
 * Your goal: Determine what a user should wear based on the 
 * type of event they're attending and the temperature outside.
 * 
 * Options: 
 * eventType should be used as a condition for eventClothing
 *  casual = something comfy
 *  semi-formal = business casual or a polo
 *  formal = a suit
 *  
 * temperature should be used as a condition for tempClothing 
 *  temperature < 54 = a coat
 *  temperature > 74 = no jacket
 *  temperature between 54 and 74 = a jacket
 */

public class CodeChallenge1 {

	public static void main(String[] args) {

		String eventType;
		String eventClothing = null;
		String tempClothing = null;
		int temp;
		
		// prompt user input for event
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the type of event?");
		eventType = scan.next();
		//System.out.println(eventType);
		
		// prompt temp
		System.out.println("What is the temperature outside?");
		temp = scan.nextInt();
		scan.close();
		//System.out.println(temp);
		
		if (eventType.equalsIgnoreCase("casual")) {
			eventClothing = "something comfy";
			//System.out.println(eventClothing);
		}
		else if (eventType.equalsIgnoreCase("semi-formal")) {
			eventClothing = "business casual or polo";
			//System.out.println("business casual or polo");
		}
		else if (eventType.equalsIgnoreCase("formal")) {
			eventClothing = "a suit";
			//System.out.println("a suit");
		}
		
		// outerwear according to temp
		if (temp > 74 ) {
			tempClothing = "no jacket";
			//System.out.println(tempClothing);
		}
		else if ((temp <= 74) && (temp >= 54)) {
			tempClothing = "a jacket";
			//System.out.println(tempClothing);
		}
		else if (temp < 54) {
			tempClothing = "a coat";
			//System.out.println(tempClothing);
		}
		
		System.out.println("You should wear " + eventClothing + " with " + tempClothing + ".");
		

	}

}
