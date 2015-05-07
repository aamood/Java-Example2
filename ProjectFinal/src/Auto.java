
public abstract class Auto {
	String make;
	int price;
	
	public String getMake(){
		return make;
	}
	
	public void setMake(String mk){
		make = mk;
	}

	public int getPrice(){
		return price;
	}
	
	public abstract void setPrice();
}
