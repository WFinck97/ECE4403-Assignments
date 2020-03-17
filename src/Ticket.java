import java.util.ArrayList;

public class Ticket {
	final ArrayList<Integer> ticketNumbers;
	final int ticketId;
	private static int ticketNum = 0;
	private int matches;
	private boolean checked = false;
	
	public Ticket() {
		ticketNumbers = NumberGenerator.generateUniqueNumbers(5, 49);
		ticketNum++;
		ticketId = ticketNum;
	}
	
	public Ticket(ArrayList<Integer> prefNumbers) {
		ticketNumbers = prefNumbers;
		ticketNum++;
		ticketId = ticketNum;
	}
	
	public int check(ArrayList<Integer> winningNums) {
		this.checked = true;
		int matches = 0;
		
		for(Integer element : winningNums) {
			if(this.ticketNumbers.contains(element)) {
				matches++;
			}
		}
		
		this.matches = matches;
		return matches;
	}
	
	public String toString() {
		if(checked) {
			return "Ticket " + ticketId + ": " + ticketNumbers + " -- " + matches + " match(es)";
		}
		
		else {
			return "Ticket " + ticketId + ": " + ticketNumbers;
		}
	}
}
