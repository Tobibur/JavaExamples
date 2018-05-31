package src;

public class Bike extends Vehicle{
	
	private int speed;

	public Bike(String vehicleType, String company, String color, int year, int speed) {
		super(vehicleType, company, color, year);
		// TODO Auto-generated constructor stub
		this.speed = speed;
	}
	
	public void setSpeed(int speed){
		this.speed = speed;
	}
	
	public int getSpeed(){
		return speed;
	}

	public String servicing() {
		// TODO Auto-generated method stub
		return "Servicing done for your Bike!";
	}
}
