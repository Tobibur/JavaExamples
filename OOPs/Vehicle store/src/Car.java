package src;

public class Car extends Vehicle{
	
	private boolean hasNitros;
	private int horsePower;
	
	public Car(String vehicleType, String company, String color, int year, boolean hasNitros, int horsePower){
		super(vehicleType, company, color, year);
		this.hasNitros = hasNitros;
		this.horsePower = horsePower;
	}
	
	public void setHasNitros(boolean hasNitros){
		this.hasNitros = hasNitros;
	}
	
	public void setHorsePower(int horsePower){
		this.horsePower = horsePower;
	}
	
	public boolean getHasNitros(){
		return this.hasNitros;
	}
	
	public int getHorsePower(){
		return this.horsePower;
	}

	public String servicing() {
		// TODO Auto-generated method stub
		return "Servicing done for your Car!";
	}
}
