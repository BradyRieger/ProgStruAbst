
import java.util.*;
public class FallDay2 
{
	private static final String RESPONSE = "Wow that sounds like fun!";
	private static final String QUESTION = "What did you do over the summer?";

	public static void main(String[] args ) 
	{
		askQuestion();
		String userFeedback = userPrompt();
		System.out.println(userFeedback);
		response();
		
		int[] array = {1, 4, 7};
		
		int i =7;
		System.out.println();
		System.out.println();
		
		int j =7;
		System.out.println();
		System.out.println();
	}

	private static void response() {
		System.out.println(RESPONSE);
	}

	private static String userPrompt() {
		Scanner userInput = new Scanner(System.in);
		String userFeedback = userInput.nextLine();
		userInput.close();
		return userFeedback;
	}

	private static void askQuestion() {
		System.out.println(QUESTION);
	}
}
	