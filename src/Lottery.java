import java.util.ArrayList;
import java.util.Arrays;

public class Lottery {
	
	/*
	 * Note that this is a short-hand way of creating an ArrayList with initial
	 * values in a single line of code.
	 * 		
	 * 		new ArrayList<Integer>(Arrays.asList(...));
	 * 
	 * 
	 * This is equivalent to constructing an ArrayList and then repeatedly 
	 * calling the add() method for each element:
	 * 
	 * 		ArrayList<Integer> a = new ArrayList<Integer>();
	 * 		a.add(2);
	 * 		a.add(5);
	 * 		...
	 */

	public static void main(String[] args) {
		
		System.out.println(NumberGenerator.generateUniqueNumbers(5, 49));
		
		/*
		Draw draw = new Draw();

		ArrayList<Integer> ticketNumbers = new ArrayList<Integer>(Arrays.asList(2, 5, 13, 25, 38));
		draw.addTicket(new Ticket(ticketNumbers));
		for (int i=0; i<100; i++) {
			draw.addTicket(new Ticket());
		}
		
		ArrayList<Integer> winningNumbers = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 28, 29));
		draw.runLottery(winningNumbers);
		draw.displayResults();

		winningNumbers = new ArrayList<Integer>(Arrays.asList(12, 7, 5, 2, 38));
		draw.runLottery(winningNumbers);
		draw.displayResults();

		draw.runLottery();
		draw.displayResults();
		*/
	}
}