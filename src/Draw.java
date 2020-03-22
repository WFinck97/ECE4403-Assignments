import java.util.ArrayList;

public class Draw {
	
	private ArrayList<Ticket> ticketList;
	private int wins;
	private ArrayList<Integer> winningNumbers;
	
	public Draw() {
		ticketList = new ArrayList<Ticket>();
	}
	public void addTicket(Ticket ticket) {
		ticketList.add(ticket);
	}
	
	public void runLottery() {
		runLottery(NumberGenerator.generateUniqueNumbers(5, 49));
	}
	
	public void runLottery(ArrayList<Integer> winningNumbers) {
		this.winningNumbers = winningNumbers;
		wins = 0;
		
		for(Ticket ticket : ticketList) {
			if(ticket.check(winningNumbers) > 2) {
				wins++;
			}
		}
	}
	
	public void displayResults() {
		System.out.println("Lottery Results for: " + winningNumbers);
		System.out.println("======================================");
		
		for(Ticket ticket : ticketList) {
			if(ticket.check(winningNumbers) > 2) {
				System.out.println(ticket);
			}
		}
		
		System.out.println("Total Wins: " + wins);
		System.out.println("");
	}
}
