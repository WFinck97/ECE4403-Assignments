
public class Buyer {
	private int userId;
	private String status;
	private static int lastUserId = 100;
	private static int count; 
	
	public Buyer() {
		this(0);
	}
	
	public Buyer(int userId) {
		this.userId = userId;
		status = this.checkStatus();
		count = count + 1;
	}
	
	public String getStatus() {
		return status;
	}
	
	public int getUserId() {
		return userId;
	}
	
	private String checkStatus() {
		if (userId <= 100) {
			return "NONMEMBER";
		}
		
		else if (userId < 200) {
			return "INACTIVEMEMBER";
		}
		
		else {
			return "ACTIVEMEMBER";
		}
	}
	
	public void updateMembership() {
		if (status.equals("INACTIVEMEMBER")|| status.equals("ACTIVEMEMBER")) {
			return;
		}
		
		lastUserId++;
		userId = lastUserId;
		status = "ACTIVEMEMBER";
	}
	
	public String toString() {
		return getUserId() + " " + getStatus();
	}
	public static int getCount() {
		return count;
	}
}
