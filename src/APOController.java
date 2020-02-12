
public class APOController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Part part = new Part();
		
		System.out.println("description: " + part.getDescription());
		System.out.println("code: " + part.getCode());
		System.out.println("price: " + part.getPrice());
		*/
		
		Buyer tom = new Buyer();
		Buyer george = new Buyer(400);
		Buyer sam = new Buyer(500);
		
		System.out.println("Tom: " + tom);
		
		/*
		Buyer tom = new Buyer();
		System.out.println(Buyer.getCount());
		System.out.println("initial id: " + tom.getUserId());
		System.out.println("initial status: " + tom.getStatus());
		tom.updateMembership();
		System.out.println("new id: " + tom.getUserId());
		System.out.println("new status: " + tom.getStatus());
		
		
		Buyer george = new Buyer(400);
		System.out.println(Buyer.getCount());
		System.out.println("initial id: " + george.getUserId());
		System.out.println("initial status: " + george.getStatus());
		george.updateMembership();
		System.out.println("new id: " + george.getUserId());
		System.out.println("new status: " + george.getStatus());
		
		Buyer sam = new Buyer(50);
		System.out.println(Buyer.getCount());
		System.out.println("initial id: " + sam.getUserId());
		System.out.println("initial status: " + sam.getStatus());
		sam.updateMembership();
		System.out.println("new id: " + sam.getUserId());
		System.out.println("new status: " + sam.getStatus());
		*/
	}
	
}
