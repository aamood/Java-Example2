
public class UseAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ford AFord = new Ford();
		Chevy AChevy = new Chevy();
		
		AFord.setMake("Ford");
		AFord.setPrice();
		
		AChevy.setMake("Chevy");
		AChevy.setPrice();
		
		System.out.println("Your car is a " + AFord.getMake() + " and costs $" + AFord.getPrice());
		System.out.println("Your car is a " + AChevy.getMake() + " and costs $" + AChevy.getPrice());
	}

}
