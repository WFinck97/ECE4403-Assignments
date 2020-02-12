
public class Part {
	private String description;
	private String code;
	private double price;
	
	public Part(String description, String code, double price) {
		this.description = description;
		this.code = code;
		this.price = price;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getCode() {
		return code;
	}
	
	public double getPrice() {
		return price;
	}
}
